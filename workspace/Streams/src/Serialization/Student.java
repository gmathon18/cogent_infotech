package Serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int rollNo;
	int age;
	String address;
	String name;
	
	public Student(int studentAge, int studentNo, String studentAddress, String studentName) {
		this.rollNo = studentNo;
		this.age = studentAge;
		this.address = studentAddress;
		this.name = studentName;
	}
}
