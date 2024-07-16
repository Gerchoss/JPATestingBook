package com.jpatesting.DataTesting.controller;

import com.jpatesting.DataTesting.bdd.BookEntity;
import com.jpatesting.DataTesting.bdd.BookRepository;
import jakarta.persistence.Column;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class BookController {
    private final BookRepository bookRepository;

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
        myBook.setDatePublished(LocalDate.of(1990, 8, 8));
        BookEntity bookEntitySaved = bookRepository.save(myBook);
        return bookEntitySaved;
    }

    //DB's consult with GET
    @RequestMapping (value = "/DataTesting/book", method = RequestMethod.GET)
    public List<BookEntity> getBook() {
        return bookRepository.findAll();
    }
}
