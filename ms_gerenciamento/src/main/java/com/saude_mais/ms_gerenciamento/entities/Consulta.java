package com.saude_mais.ms_gerenciamento.entities;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "consulta")
public class Consulta {

    @Id
    private String id;

    private String nomePac;
    private String nomeMed;
    private String dtColsulta;
    private Action action = Action.NONE;
    
}