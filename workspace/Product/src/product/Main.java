package product;
import java.util.Scanner;


public class Main {

	public static void main (String args []) {
		
		Scanner sc = new Scanner(System.in);
		Product [] p = new Product[10];
		ProductDAO dao = new ProductDAO();
		
		int choice = 0;
		
		do {
			System.out.println("************ MENU ************");
			System.out.println("1 -> Add Product ");
			System.out.println("2 -> Print Product Details ");
			System.out.println("3 -> Update Product ");
			System.out.println("4 -> Delete Product ");
			System.out.println("5 -> Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				
				for(int i =0; i<p.length;i++) {
					
					dao.create(p, i);
				}
				
				
				break;
				
			case 2: 
				
				if(p != null) {
					dao.read(p);
				}
				break;
				
			case 3:
				
				System.out.println("Please enter the ID of the product you wish to delete");
				String productToFind = sc.next();
				dao.update(p, productToFind);
				
				break;
				
				
			case 4: 
				
				System.out.println("Please enter the ID of the product you wish to delete");
				productToFind = sc.next();
				dao.delete(p, productToFind);
				
				break;
				
			case 5:
				
				System.exit(0);
				break;
			}
			
			
			
		} while(choice !=5);
		
	}
}
