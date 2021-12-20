package nl.miwgroningen.se.ch7.advanced.rutger.libraryDemo.controller;

import nl.miwgroningen.se.ch7.advanced.rutger.libraryDemo.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.print.Book;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Alle interacties van gebruiker met bibliotheek
 */


@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @GetMapping("/")
    protected String showBookOverview(Model model) {
        model.addAttribute("allBooks", bookRepository.findAll());
        return "bookOverview";
    }

    @GetMapping("/book/new")
    protected String showBookFrom(Model model) {
        model.addAttribute("book", new Book());
        return "bookForm";
    }

    @PostMapping ("/book/new")
    protected String saveOrUpdateBook(@ModelAttribute("book") Book book, BindingResult result) {
        if (!result.hasErrors()){
            bookRepository.save(book);
        }
        return "redirect:/";
    }



}
