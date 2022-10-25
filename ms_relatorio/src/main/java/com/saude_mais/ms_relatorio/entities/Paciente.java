package com.saude_mais.ms_relatorio.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    private String id;
    private String nomePac;
    private String tel;
    private String dtNasci;
    private String ocupacao;
    private List<Consulta> consulta;

}