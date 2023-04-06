package cogent.infotech.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WireTest {

	public static void main(String [] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("cogent/infotech/wiring/config.xml");
		Person p = (Person)context.getBean("person");
		Car car = p.getCar();
		
		Address address = p.getAdd();
		
		
		System.out.println("*******Address******");
		System.out.println("House no: "+address.getHno());
		System.out.println("House no: "+address.getStreet());
		System.out.println("House no: "+address.getCity());
		
		System.out.println("******Car********");
		System.out.println("Car model: "+car.getModel());
		System.out.println("Car price: "+car.getPrice());
	}
}
