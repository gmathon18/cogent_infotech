package testDbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Question6 {

	public static void main(String[] args) {
		
		String query = "select * from department where dept_salary=(SELECT MAX(dept_salary) from department) and dept_no='30'";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			PreparedStatement pstmt = conn.prepareStatement(query);
			){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println("Employee's Department No: "+rs.getInt("dept_no"));
				System.out.println("Employee's Department name: "+rs.getString("dept_name"));
				System.out.println("Employee name: "+rs.getString("dept_emp_name"));
				System.out.println("Employee salary: "+rs.getInt("dept_salary"));
			}
			
		} catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
