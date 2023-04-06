package cogent.infotech.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	
	private String name;
	private Reservation rs;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reservation getRs() {
		return rs;
	}
	
	@Autowired
	public void setRs(Reservation rs) {
		this.rs = rs;
	}
	
	
}
