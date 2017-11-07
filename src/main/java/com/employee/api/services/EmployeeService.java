package com.employee.api.services;

import java.util.List;

import com.employee.api.models.Employee;

public interface EmployeeService {
	Employee getEmployee(Long id);

	Employee saveEmployee(Employee employee);

	List<Employee> getAllEmployess();
}
