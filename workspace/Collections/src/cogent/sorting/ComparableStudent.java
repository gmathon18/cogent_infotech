package cogent.sorting;

import java.util.Comparator;

public class ComparableStudent implements Comparable<ComparableStudent>, Comparator<ComparableStudent> {

	private int rollNo;
	private String name;
	
	public ComparableStudent(int roll, String aName) {
		super();
		this.rollNo = roll;
		this.name = aName;
	}
	
	public int getRollNo() {
		return this.rollNo;
	}


	public String getName() {
		return this.name;
	}


	@Override
	public int compareTo(ComparableStudent o) {
		String name1 = this.getName();
		String name2 = o.getName();
		
		return name1.compareTo(name2);
	
	}
	
	@Override
	public String toString() {
		
		return this.rollNo + ": " + this.name;
		
	}

	@Override
	public int compare(ComparableStudent o1, ComparableStudent o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		return name1.compareTo(name2);
	
	}


}
