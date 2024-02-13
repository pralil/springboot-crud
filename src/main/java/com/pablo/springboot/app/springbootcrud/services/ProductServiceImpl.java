package com.pablo.springboot.app.springbootcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pablo.springboot.app.springbootcrud.model.entities.Product;
import com.pablo.springboot.app.springbootcrud.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository repository; 

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    } 
    

    @SuppressWarnings("null")
    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    @SuppressWarnings("null")
    @Transactional
    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @SuppressWarnings("null")
    @Transactional
    @Override
    public Optional<Product> update(Long id, Product product) {
        Optional<Product> optionalProduct = repository.findById(id);
        if(optionalProduct.isPresent()) {
            Product productDb = optionalProduct.orElseThrow();
            
            productDb.setSku(product.getSku());
            productDb.setDescription(product.getDescription());
            productDb.setName(product.getName());
            productDb.setPrice(product.getPrice());

            return Optional.of(repository.save(productDb));
        }
        return optionalProduct;
    }

    @SuppressWarnings("null")
    @Transactional
    @Override
    public Optional<Product> delete(Long id) {
        Optional<Product> optionalProduct = repository.findById(id);
        optionalProduct.ifPresent(productDb -> {
            repository.delete(productDb);
        });
        return optionalProduct;
    }


    @Override
    @Transactional(readOnly = true)
    public boolean existsBySku(String sku) {
        return repository.existsBySku(sku);
    }



}
