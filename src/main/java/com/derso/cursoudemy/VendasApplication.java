// Quaisquer pacotes desta aplicação devem estar daqui para baixo!
package com.derso.cursoudemy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
	
	// Via classe de configuração
	@Autowired
	@Qualifier("applicationName")
	private String applicationName;
	
	// Via application.properties
	@Value("${application.version}")
	private String applicationVersion;
	
	@GetMapping("/hello")
	public String helloPaidegua() {
		return "Hellô Paidégua!!! Esta é a aplicação "
				+ applicationName + " (" + applicationVersion + ")";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
