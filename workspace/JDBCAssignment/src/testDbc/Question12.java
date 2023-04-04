package testDbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Question12{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department number");
		int deptNum= sc.nextInt();
		String sql= "call proc_dname("+deptNum+")";
		

		String connectionUrl = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
				Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			){
		
			CallableStatement stmt = conn.prepareCall(sql);
			ResultSet rs = stmt.executeQuery();
				
			while(rs.next()){
			
				System.out.println("Department name: " + rs.getString("dept_name"));
				
			}		
		} catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
