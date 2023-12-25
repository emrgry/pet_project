package com.example.pet_project.service;

import com.example.pet_project.model.entities.Application;

import java.util.List;

public interface ApplicationService {
    Application createApplication(Application application);
    Application getApplicationById(Long id);
    List<Application> getAllApplications();
    Application updateApplication(Application application);
    void deleteApplication(Long id);
}
