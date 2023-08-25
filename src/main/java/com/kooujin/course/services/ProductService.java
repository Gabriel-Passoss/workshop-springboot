package com.kooujin.course.services;

import com.kooujin.course.entities.Product;
import com.kooujin.course.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Object findById(Long id) {
        Optional<Product> product =  productRepository.findById(id);
        return product.get();
    }
}