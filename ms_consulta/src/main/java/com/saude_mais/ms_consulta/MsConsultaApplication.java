package com.saude_mais.ms_consulta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MsConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConsultaApplication.class, args);
	}

}
