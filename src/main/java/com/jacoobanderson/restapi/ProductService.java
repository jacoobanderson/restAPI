package com.jacoobanderson.restapi;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAlLProducts() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
         return productRepository.insert(product);
     }

    public void delete(String id) {
        productRepository.deleteById(id);
    }
}
