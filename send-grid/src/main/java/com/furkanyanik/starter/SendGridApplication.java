package com.furkanyanik.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.furkanyanik")
@ComponentScan(basePackages = "com.furkanyanik")

public class SendGridApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendGridApplication.class, args);
	}

	
	
	
	
	
}
