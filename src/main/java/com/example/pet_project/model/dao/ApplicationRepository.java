package com.example.pet_project.model.dao;

import com.example.pet_project.model.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
