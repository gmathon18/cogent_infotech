package cogent.javanewfeatures;

import java.util.function.Supplier;


public class SupplierTestExample {

	
	public static void main(String [] args) {
		
		Supplier<Double> randomValue = ()-> Math.random();
		System.out.println(randomValue.get());
	}
}
