package questions;

public class Student {
	
	
	private String name;
	private String address;
	private String email;
	private int roll;
	
	public Student(String name, String address, String email, int roll) {
		
		this.name = name;
		this.email = email;
		this.address = address;
		this.roll = roll;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void getDetails()
	{
		System.out.println("Student Name:" + this.name);
		System.out.println("Student Address:" + this.address);
		System.out.println("Student Email:" + this.email);
		System.out.println("Student Roll:" + this.roll);
	}
	
	public static void main(String [] args) {
		
		Student s = new Student("Gayan", "12 lycom" ,"his@s.com", 123);
		s.getDetails();
	}
}

