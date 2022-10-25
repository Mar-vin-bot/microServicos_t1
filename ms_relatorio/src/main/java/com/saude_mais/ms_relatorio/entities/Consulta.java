package com.saude_mais.ms_relatorio.entities;

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
    
}