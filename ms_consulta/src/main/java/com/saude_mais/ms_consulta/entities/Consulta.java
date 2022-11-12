package com.saude_mais.ms_consulta.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consulta {

    private String id;
    private String nomePac;
    private String nomeMed;
    private String dtColsulta;
    private Action action = Action.NONE;
    
}
