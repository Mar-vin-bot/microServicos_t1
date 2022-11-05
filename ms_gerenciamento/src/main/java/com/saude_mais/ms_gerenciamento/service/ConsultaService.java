package com.saude_mais.ms_gerenciamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.saude_mais.ms_gerenciamento.entities.Consulta;
import com.saude_mais.ms_gerenciamento.repositorie.ConsultaRepo;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    @Autowired
    ConsultaRepo repo;


    public List <Consulta> findAll(){
        return repo.findAll();
    }

    public Optional<Consulta> findById(String id){
        return repo.findById(id);
    }
    public List<Consulta> findByPacienteName(String name){
        return repo.getConsultaByPaciente(name);
    }

    public List<Consulta> findByMedicoName(String name){
        return repo.getConsultaByMedico(name);
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
