package com.saude_mais.ms_gerenciamento.repositorie;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.saude_mais.ms_gerenciamento.entities.Paciente;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepo extends MongoRepository <Paciente, String> {



    
}
