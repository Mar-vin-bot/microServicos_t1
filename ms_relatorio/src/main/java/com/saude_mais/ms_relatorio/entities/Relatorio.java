package com.saude_mais.ms_relatorio.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "relatorio"
        
public class Relatorio {

    @Id
    private String id;
    private String nomePac;
    private String nomeMed;
    private String dtConsulta;
    private String especialidadeMed;


}


