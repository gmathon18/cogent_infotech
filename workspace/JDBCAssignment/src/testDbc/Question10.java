package testDbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Question10 {

	public static void main(String  [] args) {
		
		String query = "select * from employee where emp_role='analyst'";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			PreparedStatement pstmt = conn.prepareStatement(query);
			){
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{

				System.out.println("Employee name: "+rs.getString("emp_name"));
				System.out.println("Employee salary: "+rs.getString("emp_salary"));
				System.out.println("Employee no: "+rs.getString("emp_no"));
				System.out.println("Employee role: "+rs.getString("emp_role"));
				System.out.println("");
			}
			
		} catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
}
