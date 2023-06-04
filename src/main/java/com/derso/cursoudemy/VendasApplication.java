// Quaisquer pacotes desta aplicação devem estar daqui para baixo!
package com.derso.cursoudemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
	
	@Autowired
	@Qualifier("applicationName")
	private String applicationName;
	
	@GetMapping("/hello")
	public String helloPaidegua() {
		return "Hellô Paidégua!!! Esta é a aplicação " + applicationName;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
