package com.example.pet_project.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Long id;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String address;

    private String cityId;
}
