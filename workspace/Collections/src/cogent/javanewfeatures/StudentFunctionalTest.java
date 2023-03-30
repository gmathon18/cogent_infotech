package cogent.javanewfeatures;

import java.util.ArrayList;
import java.util.function.Predicate;

import cogent.sorting.Student;

class StudentFunctional {

	int rollNo;
	int className;
	String name;
	
	public StudentFunctional(int no, int aClassName, String aName) {
		
		this.rollNo = no;
		this.className = aClassName;
		this.name = aName;
	}
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getClassName() {
		return className;
	}
	public void setClassName(int className) {
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class StudentFunctionalTest{
	
	public static void main(String [] args) {
		
		ArrayList<StudentFunctional> b = new ArrayList<StudentFunctional>();
		b.add(new StudentFunctional(1,1, "bob"));
		b.add(new StudentFunctional(2,2, "harry"));
		b.add(new StudentFunctional(3,2, "mask"));
		b.add(new StudentFunctional(2,2, "blast"));
		b.add(new StudentFunctional(5,2, "cup"));
		
		
		
		Predicate<StudentFunctional> p = (s) ->s.getRollNo() == 2;
		
		for(StudentFunctional s: b) {
			if(p.test(s)) {
				System.out.println(s.getName());
			}
		}
		
		
	}
}

