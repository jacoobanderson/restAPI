package com.jacoobanderson.restapi;

import java.time.Instant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner(ProductRepository repository) {
	// 	return args -> {
	// 	};
	// }
}
