package com.saude_mais.ms_relatorio.service;

import com.saude_mais.ms_relatorio.entities.Agendamento;
import com.saude_mais.ms_relatorio.entities.Consulta;
import com.saude_mais.ms_relatorio.entities.Medico;
import com.saude_mais.ms_relatorio.entities.Paciente;
import com.saude_mais.ms_relatorio.feigns.GerenciamentoFeignMedico;
import com.saude_mais.ms_relatorio.feigns.GerenciamentoFeignPaciente;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelatorioService {

    @Autowired
    GerenciamentoFeignMedico feignMedico;

    @Autowired
    GerenciamentoFeignPaciente feignPaciente;

    public List<Medico> getRelatorioMedicos()
    {
        return feignMedico.getAll();
    }

    public List<Agendamento> getAgendamentoMedico(String id)
    {
        var medico = feignMedico.getById(id);
        return medico.getAgendamento();
    }

    public List<Paciente> getRelatorioPacientes()
    {
        return feignPaciente.getAll();
    }

    public List<Consulta> getConsultasPaciente(String id)
    {
        var paciente = feignPaciente.getById(id);
        return paciente.getConsulta();
    }

}
