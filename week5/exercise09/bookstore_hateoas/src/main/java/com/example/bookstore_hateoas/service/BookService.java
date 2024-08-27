package com.example.bookstore_hateoas.service;

import com.example.bookstore_hateoas.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<BookDTO> findAllBooks();
    BookDTO findBookById(Long id);
    BookDTO createBook(BookDTO bookDTO);
    BookDTO updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
}
