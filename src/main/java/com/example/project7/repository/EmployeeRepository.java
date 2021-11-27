package com.example.project7.repository;

import com.example.project7.models.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByEmail(String email);

    List<Employee> findByLastname(String lastname);
    List<Employee> findByLastnameContaining(String lastname);
}
