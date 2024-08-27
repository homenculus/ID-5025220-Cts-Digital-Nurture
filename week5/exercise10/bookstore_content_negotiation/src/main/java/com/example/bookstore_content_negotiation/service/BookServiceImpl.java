package com.example.bookstore_content_negotiation.service;

import java.time.LocalDate;

import com.example.bookstore_content_negotiation.model.Book;

public class BookServiceImpl {

    public void createBook() {
        Book book = new Book(); 
        book.setId(1L); 
        book.setTitle("Book Title");
        book.setAuthor("Author Name"); 
        book.setPublishedDate(LocalDate.now());
    }
}
