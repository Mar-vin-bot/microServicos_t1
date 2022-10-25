package com.saude_mais.ms_relatorio.controller;

import com.saude_mais.ms_relatorio.entities.Agendamento;
import com.saude_mais.ms_relatorio.entities.Consulta;
import com.saude_mais.ms_relatorio.entities.Medico;
import com.saude_mais.ms_relatorio.entities.Paciente;
import com.saude_mais.ms_relatorio.service.RelatorioService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/relatorio")
@RestController
public class RelatorioController {

    @Autowired
    RelatorioService service;

    @GetMapping("/medicos")
    public List<Medico> getRelatorioMedicos() {
        return service.getRelatorioMedicos();
    }

    @GetMapping("/pacientes")
    public List<Paciente> getRelatorioPacientes() {
        return service.getRelatorioPacientes();
    }

    @GetMapping("/agendamentos/{id}")
    public List<Agendamento> getAgendamentoMedico(@PathVariable String id){
        return service.getAgendamentoMedico(id);
    }

    @GetMapping("/consultas/{id}")
    public List<Consulta> getConsultasPacientes(@PathVariable String id) {
        return service.getConsultasPaciente(id);
    }

}
