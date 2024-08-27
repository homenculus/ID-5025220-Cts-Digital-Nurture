package com.example.bookstore_security.service;

import com.example.bookstore_security.dto.LoginRequest;
import com.example.bookstore_security.dto.RegisterRequest;
import com.example.bookstore_security.model.User;
import org.springframework.security.core.Authentication;

public interface UserService {
    void registerNewUser(RegisterRequest registerRequest);
    Authentication authenticate(LoginRequest loginRequest);
    boolean existsByUsername(String username);
    User loadUserByUsername(String username);
}
