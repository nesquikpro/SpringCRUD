package com.example.project7.repository;

import com.example.project7.models.Film;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film, Long> {
    List<Film> findByName(String name);
    List<Film> findByNameContaining(String name);
}
