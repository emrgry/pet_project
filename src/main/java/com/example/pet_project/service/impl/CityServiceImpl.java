package com.example.pet_project.service.impl;

import com.example.pet_project.model.dao.CityRepository;
import com.example.pet_project.model.entities.City;
import com.example.pet_project.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repository;

    @Override
    public City createCity(City city) {
        return repository.save(city);
    }

    @Override
    public City getCityById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<City> getAllCities() {
        return repository.findAll();
    }

    @Override
    public City updateCity(City city) {
        return repository.save(city);
    }

    @Override
    public void deleteCity(Long id) {
        repository.deleteById(id);
    }
}
