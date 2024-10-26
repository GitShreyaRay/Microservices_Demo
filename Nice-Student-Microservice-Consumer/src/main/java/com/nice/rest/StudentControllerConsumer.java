package com.nice.rest;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.nice.discovery.DiscoveryClass;

@RestController
public class StudentControllerConsumer {
	@Autowired
	DiscoveryClass discoveryClass;

	private Logger log = LoggerFactory.getLogger(StudentControllerConsumer.class);
	
	@GetMapping(value = "/getStudents", produces =  "plain/text")
	public ResponseEntity<String> getStudents() throws RestClientException, IOException {
		log.info("Inside getStudents method.");
		return discoveryClass.discoveryResult("Nice-Student-Microservice-Consumer", "/crs/students", HttpMethod.GET);
	}


}
