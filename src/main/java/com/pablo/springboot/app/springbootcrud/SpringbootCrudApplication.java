package com.pablo.springboot.app.springbootcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pablo.springboot.app.springbootcrud.controllers",
								"com.pablo.springboot.app.springbootcrud.repositories",
								"com.pablo.springboot.app.springbootcrud.services",
								"com.pablo.springboot.app.springbootcrud.model.entities",
								"com.pablo.springboot.app.springbootcrud.security",
								"com.pablo.springboot.app.springbootcrud.validation"
							})
public class SpringbootCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudApplication.class, args);
	}

}
