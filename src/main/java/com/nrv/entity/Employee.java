package com.nrv.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

//@Data
@Entity
@Table(name="Employee_Data")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employeeId")
	private Long id;
	

	@Column(name="employeeName")
	private String employeename;
	
	
	@Column(name="employeeCompany")
	private String companyname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeename=" + employeename + ", companyname=" + companyname + "]";
	}
	
	

}
