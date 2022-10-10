package com.saude_mais.ms_consulta.entityes;

import java.lang.annotation.Documented;
import java.util.Date;


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
private Date dataConsulta;
private String nomeMedico;
private String especialidadeMedico;



    
}
