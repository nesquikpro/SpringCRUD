package com.example.project7.repository;

import com.example.project7.models.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenreRepository extends CrudRepository<Genre, Long> {
    List<Genre> findByName(String name);
    List<Genre> findByNameContaining(String name);
}
