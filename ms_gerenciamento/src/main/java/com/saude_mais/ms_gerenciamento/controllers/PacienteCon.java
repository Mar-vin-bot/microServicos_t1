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

import com.saude_mais.ms_gerenciamento.entities.Paciente;
import com.saude_mais.ms_gerenciamento.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteCon {

    @Autowired
    PacienteService service;

    @GetMapping(value="/{id}")
    public Paciente getById(@PathVariable String id){
        return service.findById(id).orElseThrow();
    }

    @GetMapping
    public List <Paciente> getAllObjetos(){
        return service.findAll();
    }

    @PostMapping
    public Paciente createNewObj(@RequestBody Paciente obj){
        return service.newPac(obj); 
    }

    @PutMapping
    public Paciente updateObj (@RequestBody Paciente obj){
        return service.update(obj);
    }


    @DeleteMapping("/{id}")
    public void delById(@PathVariable String id){
        service.delMedico(id);
    }
    
}
