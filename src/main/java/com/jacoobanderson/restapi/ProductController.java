package com.jacoobanderson.restapi;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    
    @GetMapping
    public List<Product> fetchAllProducts () {
        return productService.getAlLProducts();
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product newProduct) throws ServerException {
        Product product = productService.save(newProduct);
        if (product == null) {
            throw new ServerException("The product was not created.");
        } else {
            return new ResponseEntity<>(product, HttpStatus.CREATED);
        }
    } 

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable String id) throws Exception {
        try {
            productService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
