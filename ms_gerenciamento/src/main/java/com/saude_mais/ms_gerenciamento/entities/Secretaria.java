package com.saude_mais.ms_gerenciamento.entities;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "secretaria")
public class Secretaria {

    @Id
    private String id;

    private String nomeSec;
    private String cpf;
    private String dtNasci;
    private String dtAdm;
    private Action action = Action.NONE;
    
}
