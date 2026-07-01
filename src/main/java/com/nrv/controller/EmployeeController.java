package com.nrv.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nrv.entity.Employee;
import com.nrv.service.EmployeeService;

import jakarta.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/saveemployee")
	public ResponseEntity<Employee> saveEmplyee(@Valid @RequestBody Employee employee) {
			return employeeService.saveEmployee(employee);	
	}

	@GetMapping("/getemployeebyname/{employeename}")
	public Employee getEmployeeByName(@PathVariable String employeename) {
		return employeeService.getEmployeeByName(employeename);
	}
	
	@PutMapping("/updateemployeebyid")
	public Employee updateEmployee(@RequestParam Long employeeid,@RequestBody Employee employee) {
		return employeeService.updateEmployee(employeeid,employee);
	}
	
	
	
}
