package com.example.pet_project.service.impl;

import com.example.pet_project.mapper.CoreMapper;
import com.example.pet_project.model.dao.CityRepository;
import com.example.pet_project.model.dto.CityDto;
import com.example.pet_project.model.entities.City;
import com.example.pet_project.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    //ex
    @Override
    public List<CityDto> getAllCities() {
        return repository.findAll().stream()
                .map(CoreMapper.INSTANCE::toCityDto)
                .collect(Collectors.toList());
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
