package cogent.javanewfeatures;

interface lambdaInterface{
	
	public void stringLength(String a);
}



public class ApplicationLambdaExamplee {

	public static void main(String [] args) {
	
		lambdaInterface mi = (a)-> System.out.println(a.length());
		
		mi.stringLength("cogent");
	}
}
