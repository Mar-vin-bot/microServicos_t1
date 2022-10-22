package com.saude_mais.ms_relatorio.feigns;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saude_mais.ms_relatorio.entities.Medico;


@FeignClient("gerenciamento-eureka")
public interface GerenciamentoFeign {

    @RequestMapping("/medico")
    public List <Medico> getAll();
    
}


