package com.example.project7.repository;

import com.example.project7.models.Film;
import com.example.project7.models.Hall;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HallRepository extends CrudRepository<Hall, Long> {
    List<Hall> findByName(String name);
    List<Hall> findByNameContaining(String name);

    Hall findHallByName(String name);
}
