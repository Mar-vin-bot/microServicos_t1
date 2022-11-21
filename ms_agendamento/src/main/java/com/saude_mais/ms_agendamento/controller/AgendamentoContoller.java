package com.saude_mais.ms_agendamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saude_mais.ms_agendamento.Service.AgendamentoService;
import com.saude_mais.ms_agendamento.entities.Agendamento;

import java.util.List;

@RestController
@RequestMapping("/agendamento")
public class AgendamentoContoller {

    @Autowired
    AgendamentoService service;

    @GetMapping(value="/{id}")
    public Agendamento getById(@PathVariable String id){
        return service.findById(id).orElseThrow(() -> new AgendamentoNotFoundException(id));
    }

    @GetMapping
    public List <Agendamento> getAll(){
        return service.findAll();
    }

    @PostMapping
    public Agendamento create(@RequestBody Agendamento obj){
        return service.newAgendamento(obj); 
    }

    @PutMapping
    public Agendamento update (@RequestBody Agendamento agendamento){
        return service.update(agendamento);
    }

    @PutMapping("/id")
    public Agendamento update (String id, Agendamento obj){
        return service.upAgendamento(id, obj);
    }

    @DeleteMapping("/{id}")
    public void deleleteById(@PathVariable String id){
        service.delAgendamento(id);
    }

}
