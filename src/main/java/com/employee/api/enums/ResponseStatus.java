package com.employee.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseStatus {
	SUCCESS(200), FAILED(400);

	private int value;

}
