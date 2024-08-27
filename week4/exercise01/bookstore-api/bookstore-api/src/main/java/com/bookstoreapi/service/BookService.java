package com.bookstoreapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookstoreapi.model.Book;

@Service
public class BookService {
    public List<Book> getAllBooks() {
        return Arrays.asList(new Book());
    }
}
