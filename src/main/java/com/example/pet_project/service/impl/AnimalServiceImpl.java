package com.example.pet_project.service.impl;

import com.example.pet_project.mapper.CoreMapper;
import com.example.pet_project.model.dao.AnimalRepository;
import com.example.pet_project.model.dto.AnimalDTO;
import com.example.pet_project.model.entities.Animal;
import com.example.pet_project.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        return repository.findAll().stream()
                .map(CoreMapper.INSTANCE::toAnimalDto)
                .collect(Collectors.toList());
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
