package com.example.bookstore_hateoas.repository;

import com.example.bookstore_hateoas.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
