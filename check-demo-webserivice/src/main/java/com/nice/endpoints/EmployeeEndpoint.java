package com.nice.endpoints;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.nice.repository.EmployeeRepository;

import io.spring.guides.gs_producing_web_service.AddEmployeeRequest;
import io.spring.guides.gs_producing_web_service.AddEmployeeResponse;
import io.spring.guides.gs_producing_web_service.GetEmployeeRequest;
import io.spring.guides.gs_producing_web_service.GetEmployeeResponse;

@Endpoint
public class EmployeeEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeEndpoint(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	//All the operations have to be defined as a payload method
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeRequest")
	@ResponsePayload
	public GetEmployeeResponse getEmployee(@RequestPayload GetEmployeeRequest request) {
		GetEmployeeResponse response = new GetEmployeeResponse();
		response.setEmployee(employeeRepository.findEmployee(Integer.parseInt(request.getId())));

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addEmployeeRequest")
	@ResponsePayload
	public AddEmployeeResponse addEmployee(@RequestPayload AddEmployeeRequest request) {
		AddEmployeeResponse response = new AddEmployeeResponse();
		response.setEmployee(employeeRepository.addEmployee(request.getEmployee()));

		return response;
	}
}


