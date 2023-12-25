package com.example.pet_project.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_post_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User createdBy;

    private Date createdDate;

    private Date updatedDate;

    private String title;

    private String description;

    private Boolean isActive;
}
