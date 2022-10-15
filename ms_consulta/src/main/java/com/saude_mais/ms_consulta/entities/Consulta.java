package com.saude_mais.ms_consulta.entities;

import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "consulta")

public class Consulta {

    @Id 
    private String id;

    private String idPac;
    private Date dataConsulta;
    private String nomeMedico;
    private String especialidadeMedico;
    
}
