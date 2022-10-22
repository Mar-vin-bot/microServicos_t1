package com.saude_mais.ms_gerenciamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.saude_mais.ms_gerenciamento.entities.Consulta;
import com.saude_mais.ms_gerenciamento.repositorie.ConsultaRepo;

public class ConsultaService {

    @Autowired
    ConsultaRepo repo;


    public List <Consulta> findAll(){
        return repo.findAll();
    }

    public Optional<Consulta> findById(String id){
        return repo.findById(id);
    }

    public Consulta newConsulta (Consulta obj){
        return repo.save(obj);
    }

    public Consulta update(Consulta obj){
        return repo.save(obj);
    }

    public void delConsulta(String id){
        repo.deleteById(id);
    }


    
}