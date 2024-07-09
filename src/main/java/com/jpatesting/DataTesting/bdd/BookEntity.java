package com.jpatesting.DataTesting.bdd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity(name="book")
public class BookEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name ="title", length = 50)
    private String title;

    //join
    @Column(name = "id_saga")
    private Long idSaga;

    @Column(name = "date_created")
    private LocalDate dateCreated;

    //@Column(name = "date_modified")
    //private LocalDate dateModified;

    //@Column(name = "date_deleted")
    //private LocalDate dateDeleted;

    @Column(name = "date_published")
    private LocalDate datePublished;

    //join
    //id_language
    //id_book_author_mtm
    //id_level_lang
    //id_book_category_mtm
}
