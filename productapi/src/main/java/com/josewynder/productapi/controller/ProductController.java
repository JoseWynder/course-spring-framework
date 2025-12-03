package com.josewynder.productapi.controller;

import com.josewynder.productapi.ProductRepository;
import com.josewynder.productapi.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        System.out.println("Product received: " + product);
        String id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable(name = "id") String id) {
        return productRepository.findById(id).orElse(null);
    }
}
