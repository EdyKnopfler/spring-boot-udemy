// Quaisquer pacotes desta aplicação devem estar daqui para baixo!
package com.derso.cursoudemy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.derso.cursoudemy.business.Animal;
import com.derso.cursoudemy.configuration.Gato;

@SpringBootApplication
public class VendasApplication {
	
	// Injetando um gato
	@Gato
	private Animal animal;

	@Bean
	public CommandLineRunner executar() {
		return args -> {
			animal.fazerBarulho();
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
