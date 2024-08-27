package com.example.bookstore_dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore_dto.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
