package com.nice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@EnableWebMvc
@ComponentScan("com.nice.*")
public class NiceProfessorMicroserviceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiceProfessorMicroserviceConsumerApplication.class, args);
	}

}
