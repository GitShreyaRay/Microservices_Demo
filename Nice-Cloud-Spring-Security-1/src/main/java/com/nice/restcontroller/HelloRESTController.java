package com.nice.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nice.model.Customer;

/**
 * @author Dell
 *
 */
@RestController
@RequestMapping("/api")
public class HelloRESTController {

	// method for first rest service
	@GetMapping("/lookup")
	public String helloRestService() {

		return "My first REST Service-->BOA";
	}

	// using request mapping method impl

	@RequestMapping(value = "/detailsCustomer", method = RequestMethod.GET)
	public Customer getAllCustomerDetails() {

		// set some data here hard coded
		// later look up by the service to JPA

		Customer customer = new Customer();
		customer.setCustomerID(101);
		customer.setCustomerName("BOA");
		customer.setCustomerAddress("Gurgaon");

		return customer;
	}

	// POST
	// DELETE
	// PUT

}
