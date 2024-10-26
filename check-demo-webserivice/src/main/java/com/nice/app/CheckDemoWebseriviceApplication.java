package com.nice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//Develop a SOAP Webservice for Country which will give the information on the currency, capital, Geolocation etc

@SpringBootApplication
@EnableWebMvc
@ComponentScan("com.nice.*")
public class CheckDemoWebseriviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckDemoWebseriviceApplication.class, args);
		System.out.println("Hello, Webservice has started.");
	}

}
