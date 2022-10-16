package com.example.mintic.Reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mintic.Reto3.model.Admin;
import com.example.mintic.Reto3.repository.RepositoryAdmin;


@Service
public class ServiceAdmin {

    @Autowired
    private RepositoryAdmin repositoryAdmin;

    public List<Admin> getAll(){
        return repositoryAdmin.getAll();
    } 
    
   public Optional<Admin> getAdmin(int id){
       return repositoryAdmin.getAdmin(id);
    }

    public Admin save(Admin admin) {
        if(admin.getIdAdmin() == null) {
            return repositoryAdmin.save(admin);
        }else{
            Optional<Admin> aaux=repositoryAdmin.getAdmin(admin.getIdAdmin());
            if(aaux.isEmpty()){
                return repositoryAdmin.save(admin);
            }else{
                return admin;
            }
        }

    }

}





 

