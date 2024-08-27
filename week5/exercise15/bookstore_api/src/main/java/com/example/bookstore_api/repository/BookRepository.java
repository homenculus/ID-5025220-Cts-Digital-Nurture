package com.example.bookstore_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore_api.model.Book;

public interface BookRepository extends  JpaRepository<Book, Long> {
}
