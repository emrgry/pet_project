package com.example.pet_project.model.dto;

import com.example.pet_project.model.entities.Animal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private String animalName;
}
