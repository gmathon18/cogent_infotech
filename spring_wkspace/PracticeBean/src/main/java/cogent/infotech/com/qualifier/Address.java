package cogent.infotech.com.qualifier;

public class Address {

	int hno;
	String street;
	String city;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		
		return "Hno:" + hno + " street: " + street + " city: " + city;
	}
}
