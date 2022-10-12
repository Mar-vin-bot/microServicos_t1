package com.saude_mais.ms_consulta.controller;

public class ConsultaNotFoundException extends RuntimeException {

    ConsultaNotFoundException(String id){
        super("Consulta "+id+" não foi encontrada");
    }

}
