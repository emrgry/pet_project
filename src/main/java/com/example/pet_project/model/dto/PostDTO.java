package com.example.pet_project.model.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.stream.LongStream;

@Getter
@Setter
public class PostDTO {
    @NotNull
    private Long id;
    private String userName;
    private Date createdDate;
    private Date updatedDate;
    private String title;
    private String description;
    private Boolean isActive;
    private String imageUrl;
    private String animalName;
}
