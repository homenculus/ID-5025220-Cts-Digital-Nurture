package com.bookstoreapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookstoreapi.model.Author;

@Service
public class AuthorService {
    public List<Author> getAllAuthors() {
        return Arrays.asList(new Author());
    }
}
