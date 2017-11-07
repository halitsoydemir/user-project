package com.employee.api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue
	private Long id;

	@NotNull(message = "Name can not be null!")
	private String name;
	private Integer age;

	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
}
