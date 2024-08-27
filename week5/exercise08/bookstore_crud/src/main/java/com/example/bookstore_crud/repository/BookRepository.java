package com.example.bookstore_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore_crud.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
