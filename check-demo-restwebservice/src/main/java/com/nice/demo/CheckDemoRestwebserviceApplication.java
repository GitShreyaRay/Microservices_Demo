package com.nice.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan("com.nice.*")
public class CheckDemoRestwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckDemoRestwebserviceApplication.class, args);
		System.out.println("This is my REST application.");
	}

}
