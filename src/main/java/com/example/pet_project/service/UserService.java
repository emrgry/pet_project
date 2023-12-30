package com.example.pet_project.service;

import com.example.pet_project.model.dto.UserDTO;
import com.example.pet_project.model.dto.UserLoginDTO;
import com.example.pet_project.model.entities.User;

import java.util.List;

public interface UserService {
    User createUser(UserDTO userDTO);
    User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(UserDTO user);
    void deleteUser(Long id);

    Integer checkUserLogin(UserLoginDTO userLoginDTO);
}
