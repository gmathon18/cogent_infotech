package cogent.EmployeeManagement;

public interface EmployeeDAOInterface {

	public void createEmployee();
	
	public void updateEmployee(String employeeNo);
	
	public void deleteEmployee(String employeeNo);
	
	public void readAll();
	
	public void searchEmployee(String employeeNo);
	
	public void sortEmployee();

}
