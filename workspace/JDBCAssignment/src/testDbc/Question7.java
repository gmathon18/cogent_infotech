package testDbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Question7 {
	
	public static void main(String [] args) {
		
		String query = "select * from department";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			PreparedStatement pstmt = conn.prepareStatement(query);
			){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{

				System.out.println("Employee name: "+rs.getString("dept_emp_name"));
				System.out.println("Employee manager: "+rs.getString("dept_manager"));
				System.out.println("");
			}
			
		} catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
}
