package com.saude_mais.ms_gerenciamento.entities;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medico {

    @Id
    private String id;

    private String nomeMed;
    private String crm;
    private String especialidade;
    private String turnoAtendimento;
    
}