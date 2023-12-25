package com.crick.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.crick.apis")
public class CricInformerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricInformerBackendApplication.class, args);
	}

}
