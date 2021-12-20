package nl.miwgroningen.se.ch7.advanced.rutger.libraryDemo.repository;

import nl.miwgroningen.se.ch7.advanced.rutger.libraryDemo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
