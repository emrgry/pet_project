package com.example.pet_project.model.dao;

import com.example.pet_project.model.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("SELECT p FROM Post p where p.animal.name= :animalName")
    List<Post> findByAnimalName(@Param("animalName") String animalName);
}
