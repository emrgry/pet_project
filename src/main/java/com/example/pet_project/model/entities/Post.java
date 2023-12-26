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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_generator")
    @SequenceGenerator(name="post_generator", sequenceName = "seq_post_id", allocationSize=1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "post_user_fk"))
    private User createdBy;

    private Date createdDate;

    private Date updatedDate;

    private String title;

    private String description;

    private Boolean isActive;
}
