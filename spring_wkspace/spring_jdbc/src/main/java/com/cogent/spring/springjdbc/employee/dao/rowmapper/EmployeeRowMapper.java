package com.cogent.spring.springjdbc.employee.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cogent.spring.springjdbc.employee.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			Employee e = new Employee();
			e.setFirstName(rs.getString("FIRST NAME"));
			e.setId(rs.getInt("ID"));
			e.setLastName(rs.getString("LAST NAME"));
			return e;
	}

}
