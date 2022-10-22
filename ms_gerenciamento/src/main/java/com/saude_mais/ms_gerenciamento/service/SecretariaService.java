package com.saude_mais.ms_gerenciamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.saude_mais.ms_gerenciamento.entities.Secretaria;
import com.saude_mais.ms_gerenciamento.repositorie.SecretariaRepo;

public class SecretariaService {

    @Autowired
    SecretariaRepo repo;


    public List <Secretaria> findAll(){
        return repo.findAll();
    }

    public Optional<Secretaria> findById(String id){
        return repo.findById(id);
    }

    public Secretaria newSecre (Secretaria obj){
        return repo.save(obj);
    }

    public Secretaria update(Secretaria obj){
        return repo.save(obj);
    }

    public void delSecre(String id){
        repo.deleteById(id);
    }
    
    
}
