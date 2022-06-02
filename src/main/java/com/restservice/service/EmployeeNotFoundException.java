package com.restservice.service;

class EmployeeNotFoundException extends RuntimeException {

	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}