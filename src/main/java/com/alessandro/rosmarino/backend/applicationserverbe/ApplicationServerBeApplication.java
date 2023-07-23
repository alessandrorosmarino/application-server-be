package com.alessandro.rosmarino.backend.applicationserverbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApplicationServerBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationServerBeApplication.class, args);
	}

}
