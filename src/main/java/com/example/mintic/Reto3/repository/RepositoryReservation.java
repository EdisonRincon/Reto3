package com.example.mintic.Reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mintic.Reto3.model.Reservation;
import com.example.mintic.Reto3.repository.CRUD.CrudRepositoryReservation;

@Repository
public class RepositoryReservation {

    @Autowired
    private CrudRepositoryReservation crudRepositoryReservation;

    
    public List<Reservation> getAll(){
        return (List<Reservation>) crudRepositoryReservation.findAll();
    }
    public Optional<Reservation> getReservation(int id){
        return crudRepositoryReservation.findById(id);
    }
    
    public Reservation save(Reservation reservation){
        return crudRepositoryReservation.save(reservation);
    }
    
}
