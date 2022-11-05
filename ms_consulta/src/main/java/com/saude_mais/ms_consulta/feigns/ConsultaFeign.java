package com.saude_mais.ms_consulta.feigns;

import com.saude_mais.ms_consulta.entities.Consulta;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("gerenciamento-eureka")
public interface ConsultaFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/consulta")
    public List <Consulta> getAll();

    @RequestMapping(method = RequestMethod.GET, value = "/consulta/{id}")
    public Consulta getById(@PathVariable String id);

    @RequestMapping(method = RequestMethod.GET, value = "/consulta/paciente-name/{name}")
    public List<Consulta> getByPacienteName(@PathVariable String name);
}