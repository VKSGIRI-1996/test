package com.charlie_food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class Charlie_FoodAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Charlie_FoodAppApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Charlie_FoodAppApplication.class);
	}

}
