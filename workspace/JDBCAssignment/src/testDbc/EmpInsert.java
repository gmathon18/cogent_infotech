package testDbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class EmpInsert {

		public static void main(String [] args) {
			
			String query = "insert into employee(emp_no,emp_name,emp_salary) values(1002,'Shiva',3000)";
			String connectionUrl = "jdbc:mysql://localhost:3306/cogent";
			
			try (
				Connection conn = DriverManager.getConnection(connectionUrl,"root","blessings");
				Statement stmt = conn.createStatement();
				){
				
			//TO INSERT EMPLOYEE INTO TABLE
			//	int i = stmt.executeUpdate(query);
			//	System.out.println("Rows inserted:" + i);
			
				//TO UPDATE EMPLOYEE SALARY
			//	int row=stmt.executeUpdate("update employee set emp_salary=10000 where emp_name='Shiva'");
			//	System.out.println("Rows inserted:" + row);
				
				//TO DELETE EMPLOYEE
			//	int row=stmt.executeUpdate("delete from employee where emp_name='Shiva'");
			//	System.out.println("Rows inserted:" + row);
				
				ResultSet rs= stmt.executeQuery("select * from employee");
				ResultSetMetaData rsMetaData = rs.getMetaData();
				int numberOfColumns = rsMetaData.getColumnCount();
				System.out.println("Total no of Columns: "+numberOfColumns);
				for(int i =1; i<numberOfColumns;i++) {
					
					String columnName=rsMetaData.getCatalogName(i);
					System.out.println("column number is "+i);
					System.out.println("Column name is " +columnName);
					System.out.println(rsMetaData.getTableName(i));
				}
			} catch(Exception e){
				e.printStackTrace();
				
			}
		}
}
