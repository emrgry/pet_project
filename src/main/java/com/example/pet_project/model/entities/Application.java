package com.example.pet_project.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "application", schema = "public")
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "application_generator")
    @SequenceGenerator(name="application_generator", sequenceName = "seq_application_id", allocationSize=1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false, foreignKey = @ForeignKey(name = "application_post_fk"))
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "application_user_fk"))
    private User user;

    private Date applyDate;

    private Boolean isActive;

}
