package com.example.pet_project.service;

import com.example.pet_project.model.entities.Post;

import java.util.List;

public interface PostService {

    Post createPost(Post post);
    Post getPostById(Long id);
    List<Post> getAllPosts();
    Post updatePost(Post post);
    void deletePost(Long id);
}
