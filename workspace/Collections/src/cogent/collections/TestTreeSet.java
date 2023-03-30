package cogent.collections;
import java.util.TreeSet;
import java.util.Iterator;


public class TestTreeSet {

	public static void main(String [] args) {
		
		TreeSet<String> product = new TreeSet<String>();
		
		product.add("Windex");
		product.add("J&J");
		product.add("Mr.Foam");
		product.add("Bubbles");
		
		//Test case to attempt to add duplicate
		product.add("Mr.Foam");
		
		Iterator<String> itr = product.iterator();
		
		System.out.println("Entries are: ");
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		//Print first product
		System.out.println("\nFirst Product: "+product.first());
		//Print last product
		System.out.println("Last Product: " +product.last());
	
		//Print size
		System.out.println("Current Size: " +product.size());
		
		//Remove test case
		product.remove("Mr.Foam");
		
		//Print size
		System.out.println("New size after removal: " +product.size());
		
	}
}
