package com.saude_mais.ms_relatorio.feigns;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saude_mais.ms_relatorio.entities.Paciente;

@FeignClient("gerenciamento-eureka")
public interface GerenciamentoFeignPaciente {

    @RequestMapping("/paciente")
    public List <Paciente> getAll();

    @GetMapping(value="/{id}")
    public Paciente getById(@PathVariable String id);
    
}
