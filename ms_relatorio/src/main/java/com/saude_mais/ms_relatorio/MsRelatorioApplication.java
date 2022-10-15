package com.saude_mais.ms_relatorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableMongoRepositories
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MsRelatorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRelatorioApplication.class, args);
	}

}
