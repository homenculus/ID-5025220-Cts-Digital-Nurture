package com.example.bookstore_actuator.service;

import java.util.List;

import com.example.bookstore_actuator.model.Book;

public interface BookService {

    List<Book> getAllBooks();

    Book createBook(Book book);

    Book getBookById(Long id);
}
