package com.example.pet_project.model.dao;

import com.example.pet_project.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
