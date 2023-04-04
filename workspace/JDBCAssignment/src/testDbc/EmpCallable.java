package testDbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.CallableStatement;

public class EmpCallable {

	public static void main(String [] args) {
		
		String sql= "call retreive_persons";
		String connectionUrl = "jdbc:mysql://localhost:3306/cogentdb";
		
		try (
				Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
			){
		
			CallableStatement stmt = conn.prepareCall(sql);
			ResultSet rs = stmt.executeQuery();
				
			while(rs.next()){
				System.out.println("ID: "+rs.getInt(1));
				System.out.println("First name: " + rs.getString(2));
				System.out.println("Last name :"+ rs.getString(3));	
			}		
		} catch(Exception e){
			e.printStackTrace();
			
		}
	}
}
