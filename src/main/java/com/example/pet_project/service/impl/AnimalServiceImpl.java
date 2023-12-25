package com.example.pet_project.service.impl;

import com.example.pet_project.model.dao.AnimalRepository;
import com.example.pet_project.model.entities.Animal;
import com.example.pet_project.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository repository;

    @Override
    public Animal createAnimal(Animal animal) {
        return repository.save(animal);
    }

    @Override
    public Animal getAnimalById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Animal> getAllAnimals() {
        return repository.findAll();
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return repository.save(animal);
    }

    @Override
    public void deleteAnimal(Long id) {
        repository.deleteById(id);
    }
}
