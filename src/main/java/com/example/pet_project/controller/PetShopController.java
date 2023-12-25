package com.example.pet_project.controller;

import com.example.pet_project.mapper.CoreMapper;
import com.example.pet_project.model.dto.*;
import com.example.pet_project.service.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/petShop")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PetShopController {

    private AnimalService animalService;
    private ApplicationService applicationService;
    private CityService cityService;
    private PostService postService;
    private ProductService productService;
    private UserService userService;


    @PostMapping("/addAnimal")
    public ResponseEntity<Void> addAnimal(AnimalDTO animalDTO) {
        animalService.createAnimal(CoreMapper.INSTANCE.toAnimal(animalDTO));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/addUser")
    public ResponseEntity<Void> addUser(UserDTO userDTO) {
        userService.createUser(CoreMapper.INSTANCE.toUser(userDTO));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Void> addProduct(ProductDTO productDTO) {
        productService.createProduct(CoreMapper.INSTANCE.toProduct(productDTO));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/addCity")
    public ResponseEntity<Void> addCity(CityDto cityDto) {
        cityService.createCity(CoreMapper.INSTANCE.toCity(cityDto));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/addPost")
    public ResponseEntity<Void> addPost(PostDTO postDTO) {
        postService.createPost(CoreMapper.INSTANCE.toPost(postDTO));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/addApplication")
    public ResponseEntity<Void> addApplication(ApplicationDTO applicationDTO) {
        applicationService.createApplication(CoreMapper.INSTANCE.toApplication(applicationDTO));
        return new ResponseEntity(HttpStatus.OK);
    }


}
