package com.example.bookstore_api.controller;

import com.example.bookstore_api.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping("/json")
    public ResponseEntity<String> createCustomerFromJson(@RequestBody Customer customer) {
        // Process the JSON request body
        return ResponseEntity.ok("Customer created from JSON: " + customer.getName());
    }

    @PostMapping("/form")
    public ResponseEntity<String> createCustomerFromForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String password) {
        // Process form data
        return ResponseEntity.ok("Customer created from form: " + name);
    }
}
