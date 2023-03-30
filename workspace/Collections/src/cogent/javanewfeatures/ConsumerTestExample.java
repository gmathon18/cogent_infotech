package cogent.javanewfeatures;

import java.util.function.Consumer;

public class ConsumerTestExample {

	
	public static void main(String [] args) {
		
			Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
			
			c.accept("COGENTINFOTECH");
	}
}
