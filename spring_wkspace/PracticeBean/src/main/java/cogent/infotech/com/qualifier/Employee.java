package cogent.infotech.com.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("address2")
	private Address address;

	// IF MULTIPLE BEANS IN XML FILE WITH SAME CLASS TYPE, CONTAINER WILL BECOME CONFUSED
	// TO WHICH OBJECT TO USE TO PERFORM AUTOWIRING IN EMPLOYEE AND THROW EXCEPTION
	//TO SPECIFIY USE QUALIFIER ANNOTATION AND EXPLICITLY SPECIFY
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		return "Employee[address: " + address + "]";
	}
	
	
}
