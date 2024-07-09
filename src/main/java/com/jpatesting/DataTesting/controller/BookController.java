package com.jpatesting.DataTesting.controller;

import com.jpatesting.DataTesting.bdd.BookEntity;
import com.jpatesting.DataTesting.bdd.BookRepository;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Column(name = "date_deleted")
    private LocalDate dateDeleted;

    @Column(name = "date_published")
    private LocalDate datePublished;

    @PostMapping("/DataTesting/book")
    public BookEntity createBook(){
        BookEntity myBook = new BookEntity();
        myBook.setTitle("Jurassic Park");
        myBook.setIdSaga(1L);
        myBook.setDateCreated(LocalDate.now());
        myBook.setDateModified(null);
        myBook.setDateDeleted(null);
        myBook.setDatePublished(LocalDate.of(1990, 8, 8));
        BookEntity bookEntitySaved = bookRepository.save(myBook);
        return bookEntitySaved;
    }
}
