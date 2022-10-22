package com.saude_mais.ms_consulta.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.saude_mais.ms_consulta.entities.Consulta;

@Repository
public interface ConsultaRepo extends MongoRepository <Consulta, String>{

    
    
}
