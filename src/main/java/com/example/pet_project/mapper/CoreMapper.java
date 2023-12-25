package com.example.pet_project.mapper;

import com.example.pet_project.model.dto.*;
import com.example.pet_project.model.entities.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CoreMapper {

    public static CoreMapper INSTANCE = Mappers.getMapper(CoreMapper.class);
    Animal toAnimal(AnimalDTO animalDTO);
    AnimalDTO toAnimalDto(Animal animal);

    UserDTO toUserDto(User user);
    User toUser(UserDTO userDTO);

    ProductDTO toProductDto(Product product);

    Product toProduct(ProductDTO productDTO);

    City toCity(CityDto cityDto);
    CityDto toCityDto(City city);

    PostDTO toPostDto(Post post);
    Post toPost(PostDTO postDTO);

    ApplicationDTO toApplicationDto(Application application);
    Application toApplication(ApplicationDTO applicationDTO);
}
