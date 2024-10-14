package com.example.RestWithDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.RestWithDatabase")
public class RestWithDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWithDatabaseApplication.class, args);
	}

}
