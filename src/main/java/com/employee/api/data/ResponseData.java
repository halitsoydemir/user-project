package com.employee.api.data;

import com.employee.api.enums.ResponseStatus;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ResponseData {
	private Object data;
	private ResponseStatus status;
	private String message;
}
