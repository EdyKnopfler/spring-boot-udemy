package com.derso.cursoudemy.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

// Usando a anotação customizada
@Development
public class MinhaConfigDeDevelopment {
	
	@Bean
	public CommandLineRunner executar() {
		// Quando sobe o servidor isto deverá ser executado
		return args -> {
			System.out.println("RODANDO EM DESENVOLVIMENTO!!");
		};
	}

}
