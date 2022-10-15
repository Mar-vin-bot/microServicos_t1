package com.saude_mais.ms_relatorio.repositorie;

import com.saude_mais.ms_relatorio.entities.Relatorio;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RelatorioRepo  extends MongoRepository <Relatorio, String> {
}
