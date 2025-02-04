package com.nice.repo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nice.model.Employee;
import com.nice.rest.EmployeeController;

@Repository
public class EmployeeDAO {

	List<Employee> empList = new ArrayList<Employee>();

	Employee e1 = new Employee();
	private static final Logger log = LoggerFactory.getLogger(EmployeeDAO.class);

	public Employee addEmployee(Employee e) {
		empList.add(e);
		return e;
	}

	//@XmlElement
	public Employee getEmployee(int id) {

		for (Employee e : empList) {
			if (e.getEmployeeID() == id)
				return e;
		}
		e1.setEmployeeID(0);
		e1.setEmployeeName("N/A");
		e1.setEmployeeAddress("N/A");
		return e1;
	}

	//@XmlElement
	public List<Employee> getAllEmployee() {
		if (null == empList)
			log.debug("Size is empty");

		return empList;
	}

	//@XmlElement
	public Employee deleteEmployee(int id) {
		
		log.debug("Deleted 1.");
		Employee e2Del = new Employee();
		for (Employee e : empList) {
			if (e.getEmployeeID() == id)
				e2Del = e;
				
			
		}
		
		if(null != e2Del) {
			empList.remove(e2Del);
			return e2Del;
		} 

		e1.setEmployeeID(0);
		e1.setEmployeeName("N/A");
		e1.setEmployeeAddress("N/A");

		return e1;
		}

	//@XmlElement
	public Employee updateEmployee(Employee emp) {
		
		Employee e2Upd = new Employee();
		int index =0,i;
		for (i =0; index<empList.size();index++) {
			e2Upd = empList.get(index);
			if (e2Upd.getEmployeeID() == emp.getEmployeeID()) {
				index = i;
				break;
			}
		}
		if(null != e2Upd) {
			empList.set(index, emp);
			return emp;
		}

		e1.setEmployeeID(0);
		e1.setEmployeeName("N/A");
		e1.setEmployeeAddress("N/A");
		return e1;
	}

}
