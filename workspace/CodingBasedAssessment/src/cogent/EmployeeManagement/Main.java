package cogent.EmployeeManagement;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> db = new ArrayList<Employee>();
		EmployeeDAOImpl dao = new EmployeeDAOImpl(db);

		int choice = -1;

		do {
			System.out.println("-----******** WELCOME TO THE EMPLOYEE MANAGEMENT DATABASE ********-----\n");
			System.out.println("------------******************* MENU ******************------------");
			System.out.println("------------1. CREATE EMPLOYEE-------------------------");
			System.out.println("------------2. UPDATE EMPLOYEE-------------------------");
			System.out.println("------------3. DELETE EMPLOYEE-------------------------");
			System.out.println("------------4. READ ALL EMPLOYEE-----------------------");
			System.out.println("------------5. SEARCH FOR AN EMPLOYEE------------------");
			System.out.println("------------6. SORT EMPLOYEE BASED ON NAME ------------");
			System.out.println("------------7. EXIT------------------------------------");

			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
						dao.createEmployee();
						break;
				
				case 2:
						System.out.println("Please enter the employee number of the employee to update");
						String employee = sc.next();
						dao.updateEmployee(employee);
						break;
							
				case 3:
						System.out.println("Please enter the employee number of the employee to delete");
						dao.deleteEmployee(sc.next());
						break;

				
				case 4:
						dao.readAll();
						break;
				
				case 5:
						System.out.println("Please enter the employee number of the employee to find");
						dao.searchEmployee(sc.next());
						break;
				
				case 6: 
						dao.sortEmployee();
						break;
						
				case 7: 
						System.out.println("Thank you for visiting the Employee Database. GoodBye!");
						
						break;
			
					
				
			}
		} while (choice != 7);
	}
}
