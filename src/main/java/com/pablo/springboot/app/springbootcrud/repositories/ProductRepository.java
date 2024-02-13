package com.pablo.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pablo.springboot.app.springbootcrud.model.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

    boolean existsBySku(String sku);
}
