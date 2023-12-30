package com.example.pet_project.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "animal", schema = "public")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_generator")
    @SequenceGenerator(name="animal_generator", sequenceName = "seq_animal_id", allocationSize=1)
    private Long id;
    @NotBlank(message = "Name is mandatory")
    private String name;

}
