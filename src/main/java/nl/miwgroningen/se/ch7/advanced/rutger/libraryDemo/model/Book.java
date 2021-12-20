package nl.miwgroningen.se.ch7.advanced.rutger.libraryDemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Rutger Dijkstra <r.e.dijkstra@st.hanze.nl>
 * Dit is een boek die door de bibliotheek uitgeleend kan worden.
 */


@Entity
@Getter @Setter
public class Book {

    @Id
    @GeneratedValue
    private Long bookId;

    private String title;

    private String author;


}
