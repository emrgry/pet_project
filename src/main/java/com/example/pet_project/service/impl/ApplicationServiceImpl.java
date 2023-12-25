package com.example.pet_project.service.impl;

import com.example.pet_project.model.dao.ApplicationRepository;
import com.example.pet_project.model.entities.Application;
import com.example.pet_project.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    @Override
    public Application createApplication(Application application) {
        return repository.save(application);
    }

    @Override
    public Application getApplicationById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Application> getAllApplications() {
        return repository.findAll();
    }

    @Override
    public Application updateApplication(Application application) {
        return repository.save(application);
    }

    @Override
    public void deleteApplication(Long id) {
        repository.deleteById(id);
    }
}
