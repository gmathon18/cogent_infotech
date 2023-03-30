package cogent.sorting;

import java.util.Comparator;

public class StudentComparator implements Comparator<ComparableStudent>{

	@Override
	public int compare(ComparableStudent o1, ComparableStudent o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		return name1.compareTo(name2);
	
	}

}
