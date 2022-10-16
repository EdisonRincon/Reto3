package com.example.mintic.Reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.mintic.Reto3.model.Client;
import com.example.mintic.Reto3.repository.CRUD.CrudRepositoryClient;



@Repository
public class RepositoryClient {

    @Autowired
    public CrudRepositoryClient crudRepositoryClient;
    
    
    public List<Client> getAll(){
        return (List<Client>) crudRepositoryClient.findAll();
    }
    public Optional<Client> getClient(int id){
        return crudRepositoryClient.findById(id);
    }
    
    public Client save(Client client){
        return crudRepositoryClient.save(client);
    }
    public Optional<Client> getClient(Object id) {
        return null;
    }
 
    
}
