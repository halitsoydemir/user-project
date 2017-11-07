package com.employee.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.api.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
