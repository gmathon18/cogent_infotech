package product;

public class Product {

	String ID;
	String name;
	double price;
	
	public Product(String aID, String aName, double aPrice) {
		
		this.ID = aID;
		this.name = aName;
		this.price = aPrice;
		
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String iD) {
		this.ID = iD;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
