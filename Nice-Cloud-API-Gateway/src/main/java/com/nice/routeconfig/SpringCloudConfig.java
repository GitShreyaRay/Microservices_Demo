package com.nice.routeconfig;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * @author Dell
 *
 */
@Configuration
public class SpringCloudConfig {

	// HelloSErvice Route to Look by the API GATEWay
	@Bean
	public RouterFunction<ServerResponse> helloServiceRoute() {

		System.out.println("Inside Route 1 config");
		return GatewayRouterFunctions.route("Nice-Hello-Microservice-Producer-API")
				.route(RequestPredicates.path("/api/*"), HandlerFunctions.http("http://localhost:8082")).build();

	}

	// ProductService Route to look by API Gateway

	@Bean
	public RouterFunction<ServerResponse> productServiceRoute() {

		System.out.println("Inside Route 2 config");
		return GatewayRouterFunctions.route("Nice-Student-Microservice-Producer")
				.route(RequestPredicates.path("/api2/*"), HandlerFunctions.http("http://localhost:8084")).build();

	}

}
