package testDbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class Question1 {
	
		
			
	public static void main(String [] args) {
		
		String query = "insert into department(dept_no,dept_name,dept_emp_name, dept_salary) values(14,'Perfume', 'Harry' ,73)";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			Statement stmt = conn.createStatement();
			){
			
				int i = stmt.executeUpdate(query);
				System.out.println("Rows inserted:" + i);
		
	
			
		} catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	
}
