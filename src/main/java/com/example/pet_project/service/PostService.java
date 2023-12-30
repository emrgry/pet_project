package com.example.pet_project.service;

import com.example.pet_project.model.dto.PostDTO;
import com.example.pet_project.model.entities.Post;

import java.util.List;

public interface PostService {

    Post createPost(PostDTO postDTO);
    Post getPostById(Long id);
    List<Post> getAllPosts();
    Post updatePost(PostDTO post);
    void deletePost(Long id);
}
