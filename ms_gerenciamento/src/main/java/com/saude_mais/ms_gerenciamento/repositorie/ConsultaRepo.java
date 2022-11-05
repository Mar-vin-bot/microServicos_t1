package com.saude_mais.ms_gerenciamento.repositorie;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.saude_mais.ms_gerenciamento.entities.Consulta;

import java.util.List;

@Repository
public interface ConsultaRepo extends MongoRepository <Consulta, String> {

    @Query("{nomePac: ?0}")
    public List<Consulta> getConsultaByPaciente(String nomePac);

    @Query("{nomeMed: ?0")
    public List<Consulta> getConsultaByMedico(String nomeMed);
    
}
