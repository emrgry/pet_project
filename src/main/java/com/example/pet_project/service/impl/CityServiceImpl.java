package com.example.pet_project.service.impl;

import com.example.pet_project.model.dao.CityRepository;
import com.example.pet_project.model.dto.CityDto;
import com.example.pet_project.model.entities.City;
import com.example.pet_project.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    //ex
    @Override
    public List<CityDto> getAllCities() {
        List<City> cityList = repository.findAll();
        List<CityDto> cityDtoList = new ArrayList<>();
        for (City city : cityList) {
            cityDtoList.add(new CityDto(city.getId(), city.getCityCode(), city.getCityName()));
        }

        return cityDtoList;
    }

    @Override
    public City updateCity(City city) {
        return city != null ? repository.save(city) : null;
    }

    @Override
    public void deleteCity(Long id) {
        repository.deleteById(id);
    }
}
