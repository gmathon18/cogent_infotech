package testDbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the employee number you wish to update salary for. ");
		String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			Statement stmt = conn.createStatement();
			){

			int row=stmt.executeUpdate("update employee set emp_salary=30000 where emp_no="+sc.nextInt());
			System.out.println("Rows inserted:" + row);
			

			
		} catch(Exception e){
			e.printStackTrace();
			
		}
	}
	

}

//example : employee number -> 1002