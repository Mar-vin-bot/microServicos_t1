package com.saude_mais.ms_gerenciamento.entities;

import java.util.List;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Paciente  {

    @Id
    private String id;

    private String nomePac;
    private String tel;
    private String dtNasci;
    private String ocupacao;
    
    private List <Consulta> consulta;
    
}