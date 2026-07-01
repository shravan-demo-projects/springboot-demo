package com.nrv.service;

import org.springframework.http.ResponseEntity;

import com.nrv.entity.Employee;

import jakarta.validation.Valid;

public interface EmployeeService {

	ResponseEntity<Employee> saveEmployee(@Valid Employee employee);

	Employee getEmployeeByName(String employeename);

	Employee updateEmployee(Long employeeid, Employee employee);

	
}
