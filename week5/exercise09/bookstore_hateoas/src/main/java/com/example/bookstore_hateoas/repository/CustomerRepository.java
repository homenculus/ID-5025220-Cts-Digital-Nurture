package com.example.bookstore_hateoas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bookstore_hateoas.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
