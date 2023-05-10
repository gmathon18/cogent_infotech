package questions;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Employee> db = new ArrayList<Employee>();
		


		int choice = -1;

		do {
			System.out.println("-----******** WELCOME TO THE EMPLOYEE MANAGEMENT DATABASE ********-----\n");
			System.out.println("------------******************* MENU ******************------------");
			System.out.println("------------1. CREATE EMPLOYEE-------------------------");
			System.out.println("------------2. DELETE EMPLOYEE-------------------------");
			System.out.println("------------3. READ ALL EMPLOYEE-----------------------");
			System.out.println("------------4. EXIT------------------------------------");

			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
						System.out.println("Please enter employee name");
						String name = sc.next();
						System.out.println("Please enter employee department");
						String department = sc.next();
						System.out.println("Please enter employee email");
						String email = sc.next();
						System.out.println("Please enter employee age");
						int age = sc.nextInt();
						Employee e = new Employee(name, department, age, email);
						db.add(e);
						break;
				
							
				case 2:
						System.out.println("Please enter the employee id to delete");
						int delete = sc.nextInt();
						Employee toRemove = null;
						for(Employee e1: db) {
							
							if(e1.getId() == delete) {
								toRemove = e1;
								break;
							}
						}
						db.remove(toRemove);
						
						break;

				
				case 3:
						for(Employee e1: db) {
							System.out.println(e1.toString());
						}
						break;
				
		
						
				case 4: 
						System.out.println("Thank you for visiting the Employee Database. GoodBye!");
						
						break;
			
					
				
			}
		} while (choice != 4);
	}
}
