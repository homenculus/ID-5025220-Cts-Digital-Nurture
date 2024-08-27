package com.example.bookstore_content_negotiation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstore_content_negotiation.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
