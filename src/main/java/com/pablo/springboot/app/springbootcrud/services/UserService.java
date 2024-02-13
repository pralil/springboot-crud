package com.pablo.springboot.app.springbootcrud.services;

import java.util.List;

import com.pablo.springboot.app.springbootcrud.model.entities.User;

public interface UserService {

    List<User> findAll();
    User save(User user);
    boolean existsByUsername(String username);
    
}
