package cogent.infotech.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	@Autowired
	Car car;

	
	/* WE CAN APPLY AUTOWIRED ANNOTATION ANYWHERE IN THE CLASS*/
	
	public Car getCar() {
		return car;
	}
	
	@Autowired
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
