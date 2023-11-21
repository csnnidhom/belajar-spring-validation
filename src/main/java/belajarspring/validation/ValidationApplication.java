package belajarspring.validation;

import belajarspring.validation.properties.DatabaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({
		DatabaseProperties.class
})
@SpringBootApplication
public class ValidationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ValidationApplication.class, args);
	}

}
