package com.nice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nice.bean.Customer;

@RestController
public class HelloController {
	
	//private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping(value = "/detailsCustomer")
	public Customer getAllCustomerDetails() {

		// set some data here hard coded
		// later look up by the service to JPA

		Customer customer = new Customer();
		customer.setId(101L);
		customer.setName("BOA");
		customer.setAddress("Gurgaon");
		//log.info("Handling home");
		//log.debug("customers" +customer);

		return customer;
	}

}
