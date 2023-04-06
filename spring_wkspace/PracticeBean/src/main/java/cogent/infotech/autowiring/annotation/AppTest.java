package cogent.infotech.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main (String [] args) {
		
	
		ApplicationContext context = new ClassPathXmlApplicationContext("cogent/infotech/autowiring/annotation/config.xml");
		
		Person person = (Person) context.getBean("person");
		Car car = person.getCar();
		
		System.out.println("**************Car Details************");
		System.out.println("car model" + car.getModel());
		System.out.println("car price" + car.getPrice());
	}
}
