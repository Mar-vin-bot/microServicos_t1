package com.saude_mais.ms_relatorio.repositorie;

import com.saude_mais.ms_relatorio.entities.Relatorio;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface RelatorioRepo extends MongoRepository <Relatorio, String> {
    
//buscar todos os medicos
public List<Relatorio> findByDtAgendamentoWhitNomeMed(String nomeMed, String dtAgendamento);



//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation
/*
todos os medicos
todas as consultas do paciente
todos os agendamento do medico x para o dia
todas consultas do paciente com medico x
*/

}
