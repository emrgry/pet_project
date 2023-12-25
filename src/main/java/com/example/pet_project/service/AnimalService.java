package com.example.pet_project.service;

import com.example.pet_project.model.dto.AnimalDTO;
import com.example.pet_project.model.entities.Animal;

import java.util.List;

public interface AnimalService {
    Animal createAnimal(Animal animal);
    Animal getAnimalById(Long id);
    List<AnimalDTO> getAllAnimals();
    Animal updateAnimal(Animal animal);
    void deleteAnimal(Long id);
}
