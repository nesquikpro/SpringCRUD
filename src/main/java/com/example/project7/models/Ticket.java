package com.example.project7.models;

import javax.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Place place;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Cinema cinema;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Employee employee;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Hall hall;

    public Ticket() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Ticket(Place place, Cinema cinema, Employee employee, Hall hall) {
        this.place = place;
        this.cinema = cinema;
        this.employee = employee;
        this.hall = hall;
    }
}
