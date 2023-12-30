package com.example.pet_project.service;

import com.example.pet_project.model.dto.ProductDTO;
import com.example.pet_project.model.entities.Product;

import java.util.List;

public interface ProductService {
    Product createProduct(ProductDTO product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    Product updateProduct(ProductDTO product);
    void deleteProduct(Long id);
}
