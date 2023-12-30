package com.example.pet_project.service.impl;

import com.example.pet_project.model.dao.PostRepository;
import com.example.pet_project.model.dao.UserRepository;
import com.example.pet_project.model.dto.PostDTO;
import com.example.pet_project.model.entities.Post;
import com.example.pet_project.model.entities.User;
import com.example.pet_project.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository repository;
    @Autowired
    private UserRepository userRepository;
    @Override
    public Post createPost(PostDTO postDTO) {
        postDTO.setCreatedDate(new Date());
        return repository.save(postDTOToPost(postDTO));
    }

    @Override
    public Post getPostById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Post> getAllPosts() {
        return repository.findAll();
    }

    @Override
    public Post updatePost(PostDTO post) {
        return repository.save(postDTOToPost(post));
    }

    @Override
    public void deletePost(Long id) {
        repository.deleteById(id);
    }

    public Post postDTOToPost(PostDTO postDTO) {
        Post post = new Post();
        post.setId(postDTO.getId());

        // You'll need to fetch the User entity by userId and set it here
        if (postDTO.getUserName() != null) {
            String userName = postDTO.getUserName();
            User createdBy = userRepository.getByUserName(userName);
            post.setCreatedBy(createdBy);
        }

        post.setCreatedDate(postDTO.getCreatedDate());
        post.setUpdatedDate(postDTO.getUpdatedDate());
        post.setTitle(postDTO.getTitle());
        post.setDescription(postDTO.getDescription());
        post.setIsActive(postDTO.getIsActive());
        return post;
    }
}
