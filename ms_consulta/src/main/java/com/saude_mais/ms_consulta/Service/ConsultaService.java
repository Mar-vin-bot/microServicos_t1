package com.saude_mais.ms_consulta.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saude_mais.ms_consulta.Repositorio.ConsultaRepo;

import com.saude_mais.ms_consulta.entities.Consulta;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    ConsultaRepo repo;

    public List<Consulta> findAll(){
        return repo.findAll();
    }

    public Optional<Consulta> findById(String id){
        return repo.findById(id);
    }

    //futuras funcoes att consulta:  em caso de erro de digitação
    //futuras funcoes deletar consulta: não sei ao certo se seria necessário
    
    //não seria necessário criar consulta ja que esta deriva d agendamento






    
}
