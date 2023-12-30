package com.example.pet_project.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "city", schema = "public")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_generator")
    @SequenceGenerator(name="city_generator", sequenceName = "seq_city_id", allocationSize=1)
    private Long id;
    @NotBlank(message = "cityCode mandatory")
    private Long cityCode;

    private String cityName;
}
