package com.nice.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nice.model.Employee;
import com.nice.repo.EmployeeDAO;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDAO empDAO;
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	// GET Method Impl using the @Requestmapping impl
	// All the annotations get, post, put and delete are concised inside the request
	// mapping annotation
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/employeeDetails/{id}")
	public Employee employeeDetails(@PathVariable int id) {
		// data is hard coded data
		// get data from back :-- Collection // JDBCTemplate // JPA
 
		log.info("In Employee Detail method");
		log.debug("id:" + id);
		return empDAO.getEmployee(id);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/createemployee")
	public Employee createEmployee(@RequestBody Employee emp) {
		// data is hard coded data
		// get data from back :-- Collection // JDBCTemplate // JPA
		log.info("In Employee Post method");
		log.debug("Employee details:" + emp.toString());
		return empDAO.addEmployee(emp);
	}

	@GetMapping(value = "/all")
	public List<Employee> getAllEmployee() {
		// data is hard coded data
		// get data from back :-- Collection // JDBCTemplate // JPA
		System.out.println("Trying to fetch all");
		return empDAO.getAllEmployee();
	}

	@DeleteMapping(value = "/delete/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		// data is hard coded data
		// get data from back :-- Collection // JDBCTemplate // JPA

		return empDAO.deleteEmployee(id);
	}

	@PutMapping( value = "/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		// data is hard coded data
		// get data from back :-- Collection // JDBCTemplate // JPA

		return empDAO.updateEmployee(emp);
	}
}
