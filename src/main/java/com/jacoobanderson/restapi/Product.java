package com.jacoobanderson.restapi;
import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private int price;
    private Instant create;
    
    public Product(String name, String description, int price, Instant create) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.create = create;
    }
}
