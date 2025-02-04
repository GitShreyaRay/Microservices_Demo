package com.nice.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.nice.discovery.DiscoveryClass;
import com.nice.entity.Grade;


@RestController
public class ProfessorControllerConsumer {
	
	@Autowired
	DiscoveryClass discoveryClass;

	@RequestMapping(value = "/addGrade", consumes =  MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ResponseEntity<String> addGrade(@RequestBody Grade newGrade) throws RestClientException, IOException {
		return discoveryClass.discoveryResult("Nice-Professor-Microservice-Producer", "/addgrade", HttpMethod.POST);
	}

}
