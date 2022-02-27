package com.empresa.vaga.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.empresa.vaga.controller")

public class VagaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VagaApplication.class, args);
	}

}
