package com.example.project7.repository;

import com.example.project7.models.Cinema;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CinemaRepository extends CrudRepository<Cinema, Long> {
    List<Cinema> findByName(String name);
    List<Cinema> findByNameContaining(String name);

    Cinema findCinemaByName(String name);
}
