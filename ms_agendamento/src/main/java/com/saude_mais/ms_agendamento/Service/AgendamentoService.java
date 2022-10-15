package com.saude_mais.ms_agendamento.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saude_mais.ms_agendamento.repositorio.AgendamentoRepo;
import com.saude_mais.ms_agendamento.entities.Agendamento;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    @Autowired
    AgendamentoRepo repo;

    public List <Agendamento> findAll(){
        return repo.findAll();
    }

    public Optional<Agendamento> findById(String id){
        return repo.findById(id);
    }

    public Agendamento newAgendamento (Agendamento obj){
        return repo.save(obj);
    }

    public Agendamento upAgendamento(String id, Agendamento obj){
        obj.setId(id);
        return repo.save(obj);
    }

    public Agendamento update(Agendamento agendamento){
        return repo.save(agendamento);
    }

    public void delAgendamento(String id){
        repo.deleteById(id);
    }


    
}
