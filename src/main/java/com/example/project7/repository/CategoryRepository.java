package com.example.project7.repository;

import com.example.project7.models.Category;
import com.example.project7.models.Hall;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findByName(String name);
    List<Category> findByNameContaining(String name);

    Category findCategoryByName(String name);
}
