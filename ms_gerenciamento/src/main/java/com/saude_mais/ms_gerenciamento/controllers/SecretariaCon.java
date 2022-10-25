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

import com.saude_mais.ms_gerenciamento.entities.Secretaria;
import com.saude_mais.ms_gerenciamento.service.SecretariaService;

@RestController
@RequestMapping("/secretaria")
public class SecretariaCon {

    @Autowired
    SecretariaService service;

    @GetMapping(value="/{id}")
    public Secretaria getById(@PathVariable String id){
        return service.findById(id).orElseThrow();
    }

    @GetMapping
    public List <Secretaria> getAllObjetos(){
        return service.findAll();
    }

    @PostMapping
    public Secretaria createNewObj(@RequestBody Secretaria obj){
        return service.newSecre(obj); 
    }

    @PutMapping
    public Secretaria updateObj (@RequestBody Secretaria obj){
        return service.update(obj);
    }

    @DeleteMapping("/{id}")
    public void delById(@PathVariable String id){
        service.delSecre(id);
    }
    
}
