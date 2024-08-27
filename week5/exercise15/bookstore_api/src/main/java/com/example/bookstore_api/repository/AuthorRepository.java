package com.example.bookstore_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore_api.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
