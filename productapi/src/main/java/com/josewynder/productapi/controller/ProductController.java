package com.josewynder.productapi.controller;

import com.josewynder.productapi.ProductRepository;
import com.josewynder.productapi.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable(name = "id") String id) {
        productRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public void update(@PathVariable(name = "id") String id,
                       @RequestBody Product product) {
        product.setId(id);
        productRepository.save(product);
    }

    @GetMapping
    public List<Product> findByName(@RequestParam(name = "name") String name) {
        return productRepository.findByName(name);
    }
}
