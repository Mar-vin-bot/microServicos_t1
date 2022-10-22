package com.saude_mais.ms_gerenciamento.repositorie;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.saude_mais.ms_gerenciamento.entities.Medico;

public interface MedicoRepo extends MongoRepository <Medico, String> {
    
}