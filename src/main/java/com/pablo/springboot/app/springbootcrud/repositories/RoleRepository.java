package com.pablo.springboot.app.springbootcrud.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pablo.springboot.app.springbootcrud.model.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

    Optional<Role> findByName(String name);
}
