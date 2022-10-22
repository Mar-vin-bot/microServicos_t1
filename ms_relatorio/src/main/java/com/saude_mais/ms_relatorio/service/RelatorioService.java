package com.saude_mais.ms_relatorio.service;

import com.saude_mais.ms_relatorio.entities.Relatorio;
import com.saude_mais.ms_relatorio.entities.RelatorioMedicos;
import com.saude_mais.ms_relatorio.repositorie.RelatorioRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RelatorioService {

    @Autowired
    RelatorioRepo repo;

    public List<Relatorio> findByDtAgendamentoWhitNomeMed(String nomeMed, String dtAgendamento){
        return repo.findByDtAgendamentoWhitNomeMed(nomeMed, dtAgendamento);
    }

    public List<RelatorioMedicos> allMedicos(){
        return null;
    }

    public List<Relatorio> allConsultas(String nomePac ){
        return repo.findAll();
    }
    

}
