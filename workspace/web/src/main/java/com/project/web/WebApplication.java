package com.project.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class WebApplication {

	public static void main(String[] args) {
		System.out.println("부트 진입 ..");
		SpringApplication.run(WebApplication.class, args);
	}

}
