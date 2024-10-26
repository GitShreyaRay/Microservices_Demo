package com.nice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiceEurekaServerApplication.class, args);
	}

}
