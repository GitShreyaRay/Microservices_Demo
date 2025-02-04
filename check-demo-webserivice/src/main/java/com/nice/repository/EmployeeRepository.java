package com.nice.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import io.spring.guides.gs_producing_web_service.Employee;

import jakarta.annotation.PostConstruct;

@Repository
public class EmployeeRepository {
	private static final Map<Integer, Employee> employees = new HashMap<>();

	@PostConstruct
	public void initData() {
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("Emp1");
		emp1.setAddress("Address1");
		emp1.setSalary(1234);

		employees.put(emp1.getId(), emp1);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Emp2");
		emp2.setAddress("Address2");
		emp1.setSalary(29430);

		employees.put(emp2.getId(), emp2);


	}

	//Later other method is required inside the repo
	public Employee findEmployee(int id) {
		Assert.notNull(id, "The employee's id name must not be null");
		return employees.get(id);
	}
	
	//Later other method is required inside the repo
		public Employee addEmployee(Employee e) {
			Assert.notNull(e, "The employee must not be null");
			return employees.put(e.getId(),e);
		}

}

