package com.cogent.spring.springjdbc.employee.dao.rowmapper;

import java.util.List;

import com.cogent.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {

	
	int create(Employee employee);
	int update(Employee employee);
	int delete(int id);
	Employee read(int id);
	List<Employee> read();
	
}
