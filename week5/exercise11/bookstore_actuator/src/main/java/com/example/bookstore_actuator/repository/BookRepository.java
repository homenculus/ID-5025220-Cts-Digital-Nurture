package com.example.bookstore_actuator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore_actuator.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
