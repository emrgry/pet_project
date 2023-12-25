package com.example.pet_project.service.impl;

import com.example.pet_project.model.dao.PostRepository;
import com.example.pet_project.model.entities.Post;
import com.example.pet_project.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository repository;

    @Override
    public Post createPost(Post post) {
        return repository.save(post);
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
    public Post updatePost(Post post) {
        return repository.save(post);
    }

    @Override
    public void deletePost(Long id) {
        repository.deleteById(id);
    }
}
