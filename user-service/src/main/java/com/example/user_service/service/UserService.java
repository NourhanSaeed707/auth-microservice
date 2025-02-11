package com.example.user_service.service;

import com.example.user_service.model.Users;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<Users> getAll();

    Users getUserByEmail(String email);
}
