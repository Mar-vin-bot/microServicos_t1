package com.saude_mais.ms_agendamento.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saude_mais.ms_agendamento.repositorio.AgendamentoRepo;

@Service
public class AgendamentoService {

    @Autowired
    AgendamentoRepo repo;
    
}
