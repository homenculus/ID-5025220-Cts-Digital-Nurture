package com.example.bookstore_api.model;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private String email;
    private String password;
   
    public String getName() {
        return name;
    }
    
}
