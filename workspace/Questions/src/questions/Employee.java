package questions;

public class Employee {

	private static int id_counter = 0;
	
	private int id;
	private String name;
	private String department;
	private int age;
	private String email;
	
	public Employee(String name, String department, int age, String email) {
		
		this.id = ++id_counter;
		this.name = name;
		this.age = age;
		this.email = email;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return this.id;
	}
	@Override
	public String toString() {
		return "Name: "+ this.name + " Id: "+ this.id + " Department: " + this.department  +" Age: " + this.age + " Email: " + this.email;
		
	}
	public void setEmployee(String name, String department, int age, String email) {
		this.id = ++id_counter;
		this.name = name;
		this.age = age;
		this.email = email;
		this.department = department;
	}
	
	public static void main(String [] args) {
		
		Employee e = new Employee("Jakobi", "Petroleum", 23, "jakobi@petrol.com");
		Employee edd = new Employee("Edd", "Chemistry", 28, "chem@petrol.com");
		
		System.out.println(e.toString());
		System.out.println(edd.toString());
	}
}
