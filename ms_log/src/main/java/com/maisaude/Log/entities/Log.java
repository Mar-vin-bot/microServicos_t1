package com.maisaude.Log.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "log_mais_saude")
public class Log {

    @Id
    private String id;
    private Action action = Action.NONE;

    private String nomePac;
    private String nomeMed;
    private String dtColsulta;

    //private String nomeMed;
    private String crm;
    private String especialidade;
    private String turnoAtendimento;

    //private String nomePac;
    private String tel;
    private String dtNasci;
    private String ocupacao;

    private String nomeSec;
    private String cpf;
    //private String dtNasci;


    
}
