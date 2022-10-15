package com.saude_mais.ms_relatorio.service;

import com.saude_mais.ms_relatorio.repositorie.RelatorioRepo;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class RelatorioService {

    @Autowired
    RelatorioRepo repo;

    public List<Relatorio> findByDtAgendamentoWhitNomeMed(String nomeMed, String dtAgendamento){
        return repo.findByDtAgendamentoWhitNomeMed();
    }
    

}
