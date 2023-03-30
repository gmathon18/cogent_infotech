package cogent.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

	private List<String> names;

	public Student() {

		this.names = new ArrayList<>();

	}

	public void setNames() {

		boolean flag = true;

		while (flag == true) {
			System.out.println("Please enter a student name to add");
			Scanner sc = new Scanner(System.in);
			this.names.add(sc.next());
			System.out.println("Would you like to add another name? 1. Yes 2. No");
			if (sc.nextInt() == 2) {
				flag = false;
				sc.close();
			}
		}
	}

	public void searchName(String name) {

		if (this.names.contains(name)) {
			System.out.println("Student " + name + " has been found in our database");

		} else {
			System.out.println("Student doesn't exist in the database");

		}
	}

	public void searchName(int index) {

		try {
			System.out.println("Student " +names.get(index)+" exists at given index " + index);
		} catch (Exception e) {

			System.out.println("No Student exists at given index");
		}
	}

	public void printNames() {

		System.out.println(names);
	}

	public void removeName(String stuName) {
		if(this.names.contains(stuName)){
		names.remove(stuName);
		System.out.println("Student " +stuName+" removed successfully");
		} else {
			System.out.println("Student was never found in the db");
		}
	}
}
