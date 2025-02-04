package com.nice.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.nice.discovery.DiscoveryClass;


@RestController
public class HelloControllerConsumer {
	
	@Autowired
	DiscoveryClass discoveryClass;

	@RequestMapping(value = "/getCustomer", produces =  MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<String> getMessage() throws RestClientException, IOException {
		return discoveryClass.discoveryResult("Nice-Hello-Microservice-Producer-API", "/detailsCustomer", HttpMethod.GET);
	}

}
