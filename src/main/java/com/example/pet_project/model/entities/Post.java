package com.example.pet_project.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "post", schema = "public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Post { // hayvan tipine göre ilan araması var

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_generator")
    @SequenceGenerator(name="post_generator", sequenceName = "seq_post_id", allocationSize=1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "post_user_fk"))
    private User createdBy;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "animal_id", nullable = true, foreignKey = @ForeignKey(name = "post_animal_fk"))
    private Animal animal;

    private Date createdDate;

    private Date updatedDate;

    private String title;

    private String description;

    private String imageUrl;

    private Boolean isActive;
}
