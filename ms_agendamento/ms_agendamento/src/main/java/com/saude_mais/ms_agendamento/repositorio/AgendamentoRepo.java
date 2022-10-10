package com.saude_mais.ms_agendamento.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saude_mais.ms_agendamento.entities.Agendamento;


@Repository
public interface AgendamentoRepo extends MongoRepository <Agendamento, String> {
    
}
