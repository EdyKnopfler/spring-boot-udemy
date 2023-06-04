package com.derso.cursoudemy.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// Via classe de configuração
		@Autowired
		@Qualifier("applicationName")
		private String applicationName;

		// Via application.properties
		@Value("${application.version}")
		private String applicationVersion;
		
		// ${chave:default}
		@Value("${spring.profiles.active:}")
		private String activeProfile;

		@GetMapping("/hello")
		public String helloPaidegua() {
			return "Hellô Paidégua!!! Esta é a aplicação "
					+ applicationName + " (" + applicationVersion + ")\n"
					+ "Perfil ativo: " + activeProfile;
		}

}
