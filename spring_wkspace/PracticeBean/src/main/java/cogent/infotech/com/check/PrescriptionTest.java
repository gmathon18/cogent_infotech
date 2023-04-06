package cogent.infotech.com.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrescriptionTest {

	public static void main(String[] args) {
	

			ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
			Prescription p =(Prescription) ctx.getBean("prescription");
			System.out.println(p);
	}

}
