package com.nrv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nrv.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


	@Query("select e from Employee e where e.employeename=:employeename")
	Employee findByEmployeeName(@Param("employeename") String employeename);

}
