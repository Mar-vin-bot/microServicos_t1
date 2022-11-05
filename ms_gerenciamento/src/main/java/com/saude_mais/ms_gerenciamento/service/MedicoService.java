package com.saude_mais.ms_gerenciamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.saude_mais.ms_gerenciamento.entities.Medico;
import com.saude_mais.ms_gerenciamento.repositorie.MedicoRepo;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    MedicoRepo repo;

    public List <Medico> findAll(){
        return repo.findAll();
    }

    public Optional<Medico> findById(String id){
        return repo.findById(id);
    }

    public Medico save (Medico obj){
        return repo.save(obj);
    }

    public Medico update(Medico agendamento){
        return repo.save(agendamento);
    }

    public void delete(String id){
        repo.deleteById(id);
    }


    
}
