package com.example.bookstore_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore_crud.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
