package com.desafio.nubank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class NubankApplication {

	public static void main(String[] args) {
		SpringApplication.run(NubankApplication.class, args);
	}

}
