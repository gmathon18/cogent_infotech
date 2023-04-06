package cogent.infotech.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReservationTest {

		public static void main(String [] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("cogent/infotech/autowiring/annotation/config.xml");
			
			Customer c = (Customer) context.getBean("customer");
			Reservation res = c.getRs();
			
			System.out.println("Customer: "+ c.getName());
			System.out.println("\nReservation Id: " + res.getId());
			System.out.println("Reservation Time: "+ res.getTime());
		}
}
