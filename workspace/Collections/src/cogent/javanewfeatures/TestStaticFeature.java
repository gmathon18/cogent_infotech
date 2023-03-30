package cogent.javanewfeatures;

interface MyInterfaceTwo{
	
	//static methods cannot be overridden
	public static void m1() {
		System.out.println("This is static method m1");
	}
}



public class TestStaticFeature {

	public static void main(String [] args) {
		
		//STATIC METHOD IN INTERFACE EXAMPLE
		// WE DON'T EVEN NEED TO CREATE AN OBJECT TO USE THE STATIC METHOD
		//SIMPLY CALL THROUGH STATIC APPROACH
		// THIS IS ONLY WAY
	
		MyInterfaceTwo.m1();
		
		//INVALID METHOD
		//m1();
		
	
	}
}
