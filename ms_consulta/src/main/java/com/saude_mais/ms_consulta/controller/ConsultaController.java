package com.saude_mais.ms_consulta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saude_mais.ms_consulta.Service.ConsultaService;
import com.saude_mais.ms_consulta.entities.Consulta;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/contulta")
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @GetMapping(value="{id}")
    public Consulta getFindById(@PathVariable String id) {
        return service.findById(id).orElseThrow(() -> new ConsultaNotFoundException(id));
    }

    @GetMapping
    public List<Consulta> getFindAll(){
        return service.findAll();
    }
    
    
}
