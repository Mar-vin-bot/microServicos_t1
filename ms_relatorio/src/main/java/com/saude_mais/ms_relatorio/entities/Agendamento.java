package com.saude_mais.ms_relatorio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Agendamento {

    private String id;
    private String idPac;
    private String dataConsulta;
    private String nomeMedico;
    private String especialidadeMedico;

}
