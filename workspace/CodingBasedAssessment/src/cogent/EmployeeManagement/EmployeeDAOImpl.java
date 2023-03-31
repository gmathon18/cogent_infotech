package cogent.EmployeeManagement;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class EmployeeDAOImpl implements EmployeeDAOInterface{

	
	List<Employee> db;
	
	public EmployeeDAOImpl(List<Employee> db) {
		
		this.db = db;
	}
	
	@Override
	public void createEmployee() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the name of the Employee");
			String employeeName = sc.next();
			System.out.println("Please enter the address of the Employee");
			String employeeAddress = sc.next();
			System.out.println("Please enter the email of the Employee");
			String employeeEmail = sc.next();
			System.out.println("Please enter the salary of the Employee (Format: X.XX where X is digit)");
			Double employeeSalary = sc.nextDouble();
			System.out.println("Please enter the Employee number");
			String employeeNumber = sc.next();
			
			Employee e = new Employee(employeeNumber, employeeName, employeeAddress, employeeEmail, employeeSalary);
			db.add(e);
			System.out.println("Employee successfully added");
	}

	@Override
	public void updateEmployee(String employeeNo) {
		
		Scanner scanner = new Scanner(System.in);
		if (this.db != null) {

			for (Employee emp : this.db) {
				if (emp != null) {
					if (emp.getEmployeeNo().equals(employeeNo)) {

						System.out.println("Would you like to update employee name? 1.Yes 2.No");
						
						if (scanner.nextInt() == 1) {
							System.out.println("Please enter updated employee name");
							emp.setEmployeeName(scanner.next());
						}
						System.out.println("Would you like to update employee address? 1.Yes 2.No");
						if (scanner.nextInt() == 1) {
							System.out.println("Please enter new employee address");
							emp.setEmployeeAddress(scanner.next());
						}
						System.out.println("Would you like to update employee email? 1.Yes 2.No");
						if (scanner.nextInt() == 1) {
							System.out.println("Please enter new employee email");
							emp.setEmployeeEmail(scanner.next());
						}
						System.out.println("Would you like to update employee salary? 1.Yes 2.No");
						if (scanner.nextInt() == 1) {
							System.out.println("Please enter new employee salary (Format X.XX where X is a digit)");
							emp.setEmployeeSalary(scanner.nextDouble());
						}
						System.out.println("Would you like to update employee number? 1.Yes 2.No");
						if (scanner.nextInt() == 1) {
							System.out.println("Please enter new employee number");
							emp.setEmployeeNo(scanner.next());
						}

						return;
					}
				}
			}
			System.out.println("Employee is not present in database");
		}
		
	}

	@Override
	public void deleteEmployee(String employeeNo) {
		
		if (this.db != null) {

			for (Employee emp : this.db) {
				if (emp != null) {
					if (emp.getEmployeeNo().equals(employeeNo)) {

						this.db.remove(emp);
						System.out.println("Employee has been successfully removed");
						return;
					}
				}
			}
			System.out.println("Employee is not present in database");
		}
		
		
	}

	@Override
	public void readAll() {
		
		if(this.db.size() == 0) {
			System.out.println("No Employees present in database");
		}
		
		for(Employee emp: this.db) {
			if(emp!= null) {
				
			System.out.println("Employee name: " + emp.getEmployeeName());
			System.out.println("Employee address: " + emp.getEmployeeAddress());
			System.out.println("Employee email: " + emp.getEmployeeEmail());
			System.out.println("Employee salary: " + emp.getEmployeeSalary());
			System.out.println("Employee No: " + emp.getEmployeeNo());
			System.out.println("");
			}
		}
		
	}

	@Override
	public void searchEmployee(String employeeNo) {
		
		if (this.db != null) {

			for (Employee emp : this.db) {
				if (emp != null) {
					if (emp.getEmployeeNo().equals(employeeNo)) {

						System.out.println("Employee has been found in the database");
						return;
					}
				}
			}
			
			System.out.println("Employee is not present in database");
		}
		
		
	}

	@Override
	public void sortEmployee() {
		
		if(this.db.size() == 0) {
			System.out.println("No Employees present in database");
		}
		
		Collections.sort(this.db, new EmployeeNameComparator());
		
		System.out.println("Employees have been succesfully sorted based on name");
		readAll();
	}
	
	class EmployeeNameComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			String s1 = o1.getEmployeeName();
			String s2 = o2.getEmployeeName();
			return s1.compareTo(s2);
		}
		
	}

}
