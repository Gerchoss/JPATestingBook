package com.jpatesting.DataTesting.bdd;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<BookEntity, Long> {
}
