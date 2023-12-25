package com.example.pet_project.model.dao;

import com.example.pet_project.model.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

}
