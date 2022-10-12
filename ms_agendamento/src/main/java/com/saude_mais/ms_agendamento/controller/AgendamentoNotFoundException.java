package com.saude_mais.ms_agendamento.controller;

public class AgendamentoNotFoundException extends RuntimeException {

    AgendamentoNotFoundException(String id){
        super("Agendamento do id "+id+" não encontrado");
    }

}
