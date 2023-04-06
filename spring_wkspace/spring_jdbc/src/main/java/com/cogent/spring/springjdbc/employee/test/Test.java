package com.cogent.spring.springjdbc.employee.test;

import com.cogent.spring.springjdbc.employee.dto.Employee;
import com.cogent.spring.springjdbc.employee.dao.rowmapper.EmployeeDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String [] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cogent/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO dao = (EmployeeDAO) ctx.getBean("employeeDAO");
		Employee emp = new Employee();
		
		emp.setId(1001);
		emp.setFirstName("Gyanendra");
		emp.setLastName("Singh");
		int i = dao.create(emp);
		
		if(i>0) {
			System.out.println("Object saved!!!");
		}
		

	}
}

