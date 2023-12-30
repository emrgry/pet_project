package com.example.pet_project.service.impl;

import com.example.pet_project.model.dao.AnimalRepository;
import com.example.pet_project.model.dao.ProductRepository;
import com.example.pet_project.model.dto.ProductDTO;
import com.example.pet_project.model.entities.Product;
import com.example.pet_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private AnimalRepository animalRepository;
    @Override
    public Product createProduct(ProductDTO product) {
        return repository.save(productDTOToProduct(product));
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product updateProduct(ProductDTO product) {
        return repository.save(productDTOToProduct(product));
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    public Product productDTOToProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
         product.setAnimal(animalRepository.getByName(productDTO.getAnimalName()));
        return product;
    }
}
