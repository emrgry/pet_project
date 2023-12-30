package com.example.pet_project.service.impl;

import com.example.pet_project.model.dao.AnimalRepository;
import com.example.pet_project.model.dto.AnimalDTO;
import com.example.pet_project.model.entities.Animal;
import com.example.pet_project.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<AnimalDTO> getAllAnimals() {
        List<AnimalDTO> animalDTOList = new ArrayList<>();
        List<Animal> animalList = repository.findAll();
        for (Animal animal : animalList) {
            animalDTOList.add(new AnimalDTO(animal.getId(), animal.getName()));
        }
        return animalDTOList;
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return animal != null ? repository.getByName(animal.getName()) : null;
    }

    @Override
    public void deleteAnimal(Long id) {
        repository.deleteById(id);
    }
}
