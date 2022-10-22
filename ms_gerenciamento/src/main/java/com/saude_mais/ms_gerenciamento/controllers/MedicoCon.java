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

import com.saude_mais.ms_gerenciamento.entities.Medico;
import com.saude_mais.ms_gerenciamento.service.MedicoService;

@RestController
@RequestMapping("/medico")
public class MedicoCon {


    @Autowired
    MedicoService service;

    @GetMapping(value="/{id}")
    public Medico getById(@PathVariable String id){
        return service.findById(id).orElseThrow();
    }

    @GetMapping
    public List <Medico> getAllObjetos(){
        return service.findAll();
    }

    @PostMapping
    public Medico createNewObj(@RequestBody Medico obj){
        return service.newAgendamento(obj); 
    }

    @PutMapping
    public Medico updateObj (@RequestBody Medico obj){
        return service.update(obj);
    }


    @DeleteMapping("/{id}")
    public void delById(@PathVariable String id){
        service.delMedico(id);
    }
    
}
