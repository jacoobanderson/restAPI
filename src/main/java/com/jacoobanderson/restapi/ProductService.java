package com.jacoobanderson.restapi;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAlLProducts() {
        return productRepository.findAll();
    }
}
