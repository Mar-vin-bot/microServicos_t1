package com.saude_mais.ms_relatorio.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RelatorioMedicos {
    private List<Medico> medicos;
}


