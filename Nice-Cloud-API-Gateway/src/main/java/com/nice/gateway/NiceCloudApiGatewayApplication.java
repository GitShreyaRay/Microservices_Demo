package com.nice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.nice.routeconfig.SpringCloudConfig;

@EnableDiscoveryClient
@Import({SpringCloudConfig.class})
@ComponentScan("com.nice.*")
@SpringBootApplication
public class NiceCloudApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiceCloudApiGatewayApplication.class, args);
	}

}
