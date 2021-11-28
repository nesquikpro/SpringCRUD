package com.example.project7.repository;

import com.example.project7.models.Ticket;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
    List<Ticket> findByCinemaName(String name);
    List<Ticket> findByCinemaNameContaining(String name);
}
