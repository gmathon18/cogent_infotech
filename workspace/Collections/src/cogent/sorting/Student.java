package cogent.sorting;
import java.util.HashMap;
import java.util.Scanner;

public class Student {

	private HashMap<String,String> empNames;
	
	
	public Student() {
		
		this.empNames= new HashMap<String,String>();
	}
	
	public void setNames() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter student rollNo");
		String rollNo = sc.next();
		System.out.println("Please enter student name");
		String name = sc.next();
				 
		
		if(this.empNames.containsKey(rollNo) != true) {
			this.empNames.put(rollNo, name);
		} else {
			System.out.println("Student already exists with this rollNo");
		}

		
	}
	
	public void printNames() {

		if (this.empNames.size() != 0) {
			System.out.println("\n");
			System.out.println("Names in Hashmap:");
			for (String k : this.empNames.keySet()) {

				System.out.println(this.empNames.get(k));
			}
		} else {
			System.out.println("No names present in hashmap");
		}
	}
	
	public void getName(String key) {
		
		if (this.empNames.size() > 0) {

			if (this.empNames.get(key) != null) {
				System.out.println("\nThe key " + key + " has value: "+ this.empNames.get(key)+"\n");
				return;
			}
		}
		System.out.print("Key was not present in hashmap");

	}
	
	public void printNamesKeySet() {
		
		System.out.println("All values in Hashmap: " +this.empNames.keySet());
		
	}
	
	public void printSize() {
		
		System.out.println("\nThe size of this hashmap is: " +this.empNames.size());
	}
	
	public void remove(String key) {
		
		if(this.empNames.size()>0) {
			
			if(this.empNames.remove(key) != null) {
				System.out.print("The key" + key + " has been removed successfully.");
				return;
			}
		}
		System.out.print("Key was not present in hashmap");
	}
}
