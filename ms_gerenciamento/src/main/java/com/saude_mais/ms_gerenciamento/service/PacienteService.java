package com.saude_mais.ms_gerenciamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.saude_mais.ms_gerenciamento.entities.Paciente;
import com.saude_mais.ms_gerenciamento.repositorie.PacienteRepo;

public class PacienteService {

    @Autowired
    PacienteRepo repo;

    public List <Paciente> findAll(){
        return repo.findAll();
    }

    public Optional<Paciente> findById(String id){
        return repo.findById(id);
    }

    public Paciente newPac (Paciente obj){
        return repo.save(obj);
    }

    public Paciente update(Paciente agendamento){
        return repo.save(agendamento);
    }

    public void delMedico(String id){
        repo.deleteById(id);
    }


    
    
}
