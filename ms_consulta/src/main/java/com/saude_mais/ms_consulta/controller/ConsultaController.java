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
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @GetMapping(value="/{id}")
    public Consulta getById(@PathVariable String id) 
    {
        return service.findById(id);
    }

    @GetMapping
    public List<Consulta> getAll()
    {
        return service.findAll();
    }

    @GetMapping(value="/paciente-name/{name}")
    public List<Consulta> getByPacienteName(@PathVariable String name)
    {
        return service.findByPacienteName(name);
    }
}
