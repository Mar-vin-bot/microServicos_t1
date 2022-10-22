package com.saude_mais.ms_gerenciamento.repositorie;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.saude_mais.ms_gerenciamento.entities.Secretaria;

public interface SecretariaRepo extends MongoRepository <Secretaria, String> {
    
}