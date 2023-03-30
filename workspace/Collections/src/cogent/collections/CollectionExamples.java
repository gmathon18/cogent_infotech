package cogent.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class CollectionExamples {

	public static void main(String [] args) {
		

		//SEE EXAMPLE FOR HASHSET
		//best performing but makes no guarantee concerning order of iteration
		Set<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(500);
		set.add(200);
		set.add(140);
		set.add(40);
		set.add(140); // Set doesn't allow duplicates
		
		System.out.println("Set is "+set);
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		// SEE EXAMPLE FOR TREESET 
		// Will place objects into incrementing order based on value
		//substantially slower than hash set
		
		
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(100);
		set2.add(500);
		set2.add(200);
		set2.add(140);
		set2.add(40);
		set2.add(140); // Set doesn't allow duplicates
		
		System.out.println("Set is "+set2);
		Iterator<Integer> itr2 = set.iterator();
		
		while(itr2.hasNext()) {
			
			System.out.println(itr2.next());
		}
		
		//SEE EXAMPLE FOR LINKEDHASHSET
		//Will place objects in order they are inserted
		Set<Integer> set3 = new LinkedHashSet<Integer>();
		set3.add(100);
		set3.add(500);
		set3.add(200);
		set3.add(140);
		set3.add(40);
		set3.add(140); // Set doesn't allow duplicates
		
		System.out.println("Set is "+set3);
		Iterator<Integer> itr3 = set3.iterator();
		
		while(itr3.hasNext()) {
			
			System.out.println(itr3.next());
		}
		
		//SEE EXAMPLE FOR HASHMAP
		//STORED IN KEY VALUE PAIR
		//UNORDERED COLLECTION
		//doesn't allow duplicate keys
		
		Map<String,Integer> map = new HashMap<>();
		map.put("John", 23);
		map.put("Radukic", 29);
		map.put("Lee", 21);
		
		Set<String> keyset = map.keySet();
		
		System.out.println("Keyset: "+keyset);
		
		Collection<Integer> values = map.values();
		System.out.println("values : "+ values);
		
		for(String key: keyset) {
			
			System.out.println("Key: "+ key + " Value: "+map.get(key));
		}
		
	}
}
