package com.employee.api.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.api.models.Employee;
import com.employee.api.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	private static final Logger Log = LoggerFactory.getLogger(EmployeeController.class);

	@GetMapping()
	public List<Employee> getAllEmployess() {
		Log.info("Employee get method called for all employees.");
		return employeeService.getAllEmployess();
	}

	@GetMapping("/{id}")
	public Employee getEmployee(Long id) {
		Log.info("Employee get method called.");
		return employeeService.getEmployee(id);
	}

	@PostMapping()
	public Employee createEmployee(Employee employee) {
		Log.info("Employee post method called.");
		return employeeService.saveEmployee(employee);
	}

}
