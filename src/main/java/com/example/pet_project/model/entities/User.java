package com.example.pet_project.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    private Long id;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String address;

    @ManyToOne
    @JoinColumn(name = "city_code")
    private City city;


}
