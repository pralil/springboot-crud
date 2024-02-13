package com.pablo.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pablo.springboot.app.springbootcrud.model.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{


    boolean existsByUsername(String username);
}
