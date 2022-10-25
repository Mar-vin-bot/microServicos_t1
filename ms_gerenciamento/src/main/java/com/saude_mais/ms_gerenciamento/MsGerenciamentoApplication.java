package com.saude_mais.ms_gerenciamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@EnableFeignClients
@EnableMongoRepositories
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MsGerenciamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGerenciamentoApplication.class, args);
	}

}
