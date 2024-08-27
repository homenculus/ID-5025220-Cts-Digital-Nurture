package com.bookstoreapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookstoreapi.model.Customer;

@Service
public class CustomerService {
    public List<Customer> getAllCustomers() {
        return Arrays.asList(new Customer());
    }
}
