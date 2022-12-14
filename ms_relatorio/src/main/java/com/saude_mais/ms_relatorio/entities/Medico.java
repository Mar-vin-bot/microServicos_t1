package com.saude_mais.ms_relatorio.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    private String id;
    private String nomeMed;
    private String crm;
    private String especialidade;
    private String turnoAtendimento;

    private List<Agendamento> agendamento;
}