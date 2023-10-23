package com.skbprod.skbprod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SkbprodApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkbprodApplication.class, args);
	}

}
