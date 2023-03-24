package product;
import java.util.Scanner;

public class ProductDAO {

	Scanner sc = new Scanner(System.in);
	
	public void create(Product [] prod, int i) {
		
		System.out.println("Please enter the ID of the Product");
		String aID = sc.next();
		
		System.out.println("Please enter the name of the Product");
		String aName = sc.next();
		
		System.out.println("Please enter the price of the Product (X.XX where X is a numeric value)");
		Double aPrice = sc.nextDouble();
		
		Product p = new Product(aID, aName, aPrice);
		
		prod[i] = p;
				
	}
	
	public void read(Product [] prod) {
		
		for(Product p : prod) {
			if(p!= null) {
				
				System.out.println("The ID of the product is " +p.getID());
				System.out.println("The name of the product is " +p.getName());
				System.out.println("The price of the product is " +p.getPrice());
			}
		}
	}
	
	public void update( Product [] prod, String productID) {
		
		boolean found = false;
		
		for(Product p: prod) {
			
			if(p.getID().equals(productID)) {
				found = true;
				System.out.println("Would you like to update the product name? Please enter 1 for Yes and 2 for No");
				int response = sc.nextInt();
				if(response == 1) {
					System.out.println("Please enter the updated Product name");
					p.setName(sc.next());
				}
				
				System.out.println("Would you like to update the product price? Please enter 1 for Yes and 2 for No");
				response = sc.nextInt();
				if(response == 1) {
					System.out.println("Please enter the updated Product Price (X.XX where X is a numeric value)");
					p.setPrice(sc.nextDouble());
				}
				
				System.out.println("Would you like to update the product ID? Please enter 1 for Yes and 2 for No");
				response = sc.nextInt();
				if(response == 1) {
					System.out.println("Please enter the updated Product ID");
					p.setID(sc.next());
				}
				break;
			}
		}
		if(found == false) {
			System.out.println("The product ID does not match any entry available.");
		}
	}
	
	public void delete(Product [] prod, String prodID ) {
		boolean found = false;
		for(int i = 0; i<prod.length;i++) {
			if(prod[i].getID().equals(prodID)) {
				prod[i] = null;
				found = true;
				System.out.println("The product has been deleted successfully");
				break;
			}
			
		}
		
		if(found == false) {
			System.out.println("The product ID does not match any entry available.");
		}
	}
	
}
