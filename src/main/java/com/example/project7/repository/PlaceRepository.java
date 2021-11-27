package com.example.project7.repository;

import com.example.project7.models.Place;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlaceRepository extends CrudRepository<Place, Long> {
    List<Place> findByRow(Integer row);
}
