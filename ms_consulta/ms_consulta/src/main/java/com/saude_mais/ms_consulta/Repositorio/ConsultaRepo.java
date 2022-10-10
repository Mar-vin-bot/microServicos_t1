package com.saude_mais.ms_consulta.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepo extends MongoRepository <Consulta, String> {
    
}
