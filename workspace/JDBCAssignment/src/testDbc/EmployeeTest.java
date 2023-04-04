package testDbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeTest {

		public static void main(String [] args) {
			
			String query = "Select * from employee";
			String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
			
			try (
				Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
				PreparedStatement pstmt = conn.prepareStatement(query);
				){
				ResultSet rs = pstmt.executeQuery();
				while(rs.next())
				{
					System.out.println("Employee ID: "+rs.getInt("emp_no"));
					System.out.println("Employee name: "+rs.getString("emp_name"));
					System.out.println("Employee salary: "+rs.getInt("emp_salary"));
				}
				
			} catch(Exception e){
				e.printStackTrace();
				
			}
		}
}
