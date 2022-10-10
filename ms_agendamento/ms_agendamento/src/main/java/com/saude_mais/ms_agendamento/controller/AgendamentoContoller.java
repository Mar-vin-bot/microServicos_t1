package com.saude_mais.ms_agendamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.saude_mais.ms_agendamento.Service.AgendamentoService;

@RestController
public class AgendamentoContoller {

    @Autowired
    AgendamentoService service;
    
    
}
