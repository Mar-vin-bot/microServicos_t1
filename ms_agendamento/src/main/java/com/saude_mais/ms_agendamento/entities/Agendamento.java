package com.saude_mais.ms_agendamento.entities;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "agendamento")

public class Agendamento {

    @Id
    private String id;
    private String idPac;
    private String dataConsulta;
    private String nomeMedico;
    private String especialidadeMedico;
    private Action action = Action.NONE;

}
