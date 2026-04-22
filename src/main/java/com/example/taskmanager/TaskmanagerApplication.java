package com.example.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagerApplication.class, args);

		System.out.println("URL: " + System.getenv("SPRING_DATASOURCE_URL"));
		System.out.println("USER: " + System.getenv("SPRING_DATASOURCE_USERNAME"));
		System.out.println("PASS: " + System.getenv("SPRING_DATASOURCE_PASSWORD"));
	}

}
