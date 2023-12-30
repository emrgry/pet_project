package com.example.pet_project.model.dao;

import com.example.pet_project.model.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    Animal getByName(String name);
}
