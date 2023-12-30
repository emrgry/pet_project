package com.example.pet_project.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    @NotNull
    private String name;
    private String animalName;
}
