package testDbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the department number you wish to update the salaries of all employers for. ");
		String connectionUrl = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
			Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			Statement stmt = conn.createStatement();
			){

			int row=stmt.executeUpdate("update department set dept_salary=30000 where dept_no="+sc.nextInt());
			System.out.println("Rows inserted:" + row);
			

			
		} catch(Exception e){
			e.printStackTrace();
			
		}
	}
	

}
