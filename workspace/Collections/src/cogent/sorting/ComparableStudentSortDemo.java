package cogent.sorting;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableStudentSortDemo {

	public static void main(String [] args) {
	ArrayList<ComparableStudent> rollCall = new ArrayList<ComparableStudent>();
		
	rollCall.add(new ComparableStudent(1, "andy"));
	rollCall.add(new ComparableStudent(2, "mike"));
	rollCall.add(new ComparableStudent(3, "allen"));
	rollCall.add(new ComparableStudent(4, "khoa"));
	rollCall.add(new ComparableStudent(5, "john"));

	System.out.println("Unsorted roll call: ");
	for(ComparableStudent s: rollCall) {
		System.out.println(s.getRollNo() + ": " + s.getName());
	}
	
	
	Collections.sort(rollCall, new StudentComparator());
	System.out.println("\nSorted roll call: ");
	for(ComparableStudent s: rollCall) {
		System.out.println(s.getRollNo() + ": " + s.getName());
	}
}
}