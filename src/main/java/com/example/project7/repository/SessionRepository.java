package com.example.project7.repository;

import com.example.project7.models.Session;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface SessionRepository extends CrudRepository<Session, Long> {
    List<Session> findByDateContaining(Date date);
}
