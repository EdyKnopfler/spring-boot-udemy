package com.derso.cursoudemy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
	
	@GetMapping("/hello")
	public String helloPaidegua() {
		return "Hellô Paidégua!!!";
	}
	
	@GetMapping("/")
	public String helloRaiz() {
		return "Hellô Raiz!!! Aqui num é nutela não";
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
