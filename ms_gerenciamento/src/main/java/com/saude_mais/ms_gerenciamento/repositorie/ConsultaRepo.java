package com.saude_mais.ms_gerenciamento.repositorie;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saude_mais.ms_gerenciamento.entities.Consulta;
@Repository
public interface ConsultaRepo extends MongoRepository <Consulta, String> {
    
}
