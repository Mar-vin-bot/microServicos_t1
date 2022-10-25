package com.saude_mais.ms_relatorio.feigns;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saude_mais.ms_relatorio.entities.Medico;


@FeignClient("gerenciamento-eureka")
public interface GerenciamentoFeignMedico {

    @RequestMapping("/medico")
    public List <Medico> getAll();

    @GetMapping(value="/{id}")
    public Medico getById(@PathVariable String id);
}


