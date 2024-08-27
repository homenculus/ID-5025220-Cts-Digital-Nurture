package com.example.bookstore_content_negotiation.service;

import com.example.bookstore_content_negotiation.model.Book;

public interface BookService {
    Book getBookById(Long id);
}
