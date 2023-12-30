package com.example.pet_project.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "post", schema = "public")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_generator")
    @SequenceGenerator(name="post_generator", sequenceName = "seq_post_id", allocationSize=1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "post_user_fk"))
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "animal_id", nullable = false, foreignKey = @ForeignKey(name = "post_animal_fk"))
    private Animal animal;

    private Date createdDate;

    private Date updatedDate;

    private String title;

    private String description;

    private String imageUrl;

    private Boolean isActive;
}
