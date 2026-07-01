package com.nrv.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.nrv.controller.EmployeeController;
import com.nrv.entity.Employee;
import com.nrv.globalexceptions.DeleteException;
import com.nrv.repository.EmployeeRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   
	
	@Autowired
	EmployeeRepository employeeRepository;


	@Override
	public ResponseEntity<Employee> saveEmployee(@Valid Employee employee) {
		Employee savedEmployee=employeeRepository.save(employee);
		return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
	}

	@Override
	public Employee getEmployeeByName(String employeename) {
		
		Employee employee = employeeRepository.findByEmployeeName(employeename);
		
		if(employee!=null) {
			return employee;
		}
		return null;
		
		
	}

	@Override
	public Employee updateEmployee(Long employeeid, Employee employee) {
		Employee employees=employeeRepository.findById(employeeid).orElseThrow(()->new RuntimeException("User Not Found"));
		
		employees.setEmployeename(employee.getEmployeename());
		employees.setCompanyname(employee.getCompanyname());
				
		return employeeRepository.save(employees);
	}

	

}
