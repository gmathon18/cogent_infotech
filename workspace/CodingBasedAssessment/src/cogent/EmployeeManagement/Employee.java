package cogent.EmployeeManagement;

public class Employee {

	String employeeNo;
	String employeeName;
	String employeeAddress;
	String employeeEmail;
	Double employeeSalary;
	
	public Employee(String empNo, String empName, String empAddress, String empEmail, Double empSalary) {
		
		this.employeeNo = empNo;
		this.employeeName = empName;
		this.employeeAddress = empAddress;
		this.employeeEmail = empEmail;
		this.employeeSalary = empSalary;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
