package com.example.bookstore_dto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore_dto.dto.BookDTO;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public BookDTO createBook(@RequestBody BookDTO bookDTO) {
       
        return bookDTO;
    }

    @GetMapping("/{id}")
    public BookDTO getBook(@PathVariable Long id) {
        BookDTO bookDTO = new BookDTO(); 
        
        return bookDTO;
    }
}
