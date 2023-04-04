package testDbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Question8 {

public static void main(String [] args) {
		
		String query = "select * from department where dept_salary > (SELECT AVG(dept_salary) from department)";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			PreparedStatement pstmt = conn.prepareStatement(query);
			){
			
			ResultSet rs = pstmt.executeQuery();

			while(rs.next())
			{
				
				System.out.println("Employee name: "+rs.getString("dept_emp_name"));
				System.out.println("Employee department no: "+rs.getString("dept_no"));
				System.out.println("Employee salary: "+rs.getString("dept_salary"));
				System.out.println("");
			}
		
		} catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
}
