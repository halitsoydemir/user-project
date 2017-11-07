package com.employee.api.initializers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.employee.api.models.Employee;
import com.employee.api.services.EmployeeService;

@Component
public class DBInitializer implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		employeeService.saveEmployee(new Employee("hlt", 1));
		employeeService.saveEmployee(new Employee("cn", 2));
		employeeService.saveEmployee(new Employee("yek", 3));

	}

}
