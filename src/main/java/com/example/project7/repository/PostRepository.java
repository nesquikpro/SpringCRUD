package com.example.project7.repository;

import com.example.project7.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
    List <Post> findByName(String name);
    List<Post> findByNameContaining(String name);
    Post findPostByName(String name);
}
