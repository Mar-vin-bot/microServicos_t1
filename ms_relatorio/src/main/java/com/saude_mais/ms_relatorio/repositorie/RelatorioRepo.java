package com.saude_mais.ms_relatorio.repositorie;

import com.saude_mais.ms_relatorio.entities.Relatorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelatorioRepo extends MongoRepository <Relatorio, String> {
    
//buscar todos os medicos
public List <Relatorio> findByDtAgendamentoWhitNomeMed(String nomeMed, String dtAgendamento);





//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
/*
todos os medicos //findAll(medico)
todas as consultas do paciente //
todos os agendamento do medico x para o dia //é o primeiro, falta definir o dia??
todas consultas do paciente com medico x    //não fazer por enquanto
*/

}
