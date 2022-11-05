package com.saude_mais.ms_gerenciamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saude_mais.ms_gerenciamento.entities.Consulta;
import com.saude_mais.ms_gerenciamento.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaCon {



    @Autowired
    ConsultaService service;

    @GetMapping(value="/{id}")
    public Consulta getById(@PathVariable String id){
        return service.findById(id).orElseThrow();
    }

    @GetMapping
    public List <Consulta> getAll(){
        return service.findAll();
    }

    @GetMapping(value="/paciente-name/{name}")
    public List<Consulta> getByPacienteName(@PathVariable String name){
        return service.findByPacienteName(name);
    }

    @PostMapping
    public Consulta createNewObj(@RequestBody Consulta obj){
        return service.newConsulta(obj); 
    }

    @PutMapping
    public Consulta updateObj (@RequestBody Consulta obj){
        return service.update(obj);
    }


    @DeleteMapping("/{id}")
    public void delById(@PathVariable String id){
        service.delConsulta(id);
    }
    
}
