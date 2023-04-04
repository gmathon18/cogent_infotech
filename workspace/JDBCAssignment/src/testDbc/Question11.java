package testDbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the employee number");
		int empno = sc.nextInt();
		String sql= "call proc_empname("+empno+")";
		
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
		
		try (
				Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			){
		
			CallableStatement stmt = conn.prepareCall(sql);
			ResultSet rs = stmt.executeQuery();
				
			while(rs.next()){
			
				System.out.println("First name: " + rs.getString("emp_name"));
				
			}		
		} catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
