package com.desafio.nubank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;

@SpringBootApplication
@Async
public class NubankApplication {

	public static void main(String[] args) {
		SpringApplication.run(NubankApplication.class, args);
	}

}
