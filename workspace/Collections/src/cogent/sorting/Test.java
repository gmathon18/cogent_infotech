package cogent.sorting;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String [] args) {
		
		Set<Employee> set = new TreeSet<>();
		
		set.add(new Employee(100,"obama"));
		set.add(new Employee(400,"Tom"));
		set.add(new Employee(300,"Gyanedra"));
		set.add(new Employee(200,"Rambo"));
		
		//Research how basis of duplicates is determined in sets. is it based on the object or key?
		
		
		for(Employee employee: set) {
			System.out.println(employee.id);
			System.out.println(employee.name);
		}
		
		System.out.println("NOW THE NAMES WILL BE SORTED ON THE BASIS OF THE NAME");
		
		
		Set<Employee> set2 = new TreeSet<>(new EmployeeNameComparator());
		
		set2.add(new Employee(100,"Obama"));
		set2.add(new Employee(400,"Tom"));
		set2.add(new Employee(300,"Gyanedra"));
		set2.add(new Employee(200,"Rambo"));
		
		//Research how basis of duplicates is determined in sets. is it based on the object or key?
		
		
		for(Employee employee: set2) {
			System.out.println(employee.id);
			System.out.println(employee.name);
		}
	}
}
