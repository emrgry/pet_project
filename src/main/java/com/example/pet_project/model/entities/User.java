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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name="user_generator", sequenceName = "seq_user_id", allocationSize=1)
    private Long id;

    private String userName;

    private String password;

    private String firstName;

    private String lastName;

    private String address;

    @ManyToOne
    @JoinColumn(name = "city_code", nullable = false, foreignKey = @ForeignKey(name = "user_city_fk"))
    private City city;


}
