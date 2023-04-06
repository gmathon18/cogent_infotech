package cogent.infotech.com.lc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PatientTest {

	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Patient p = (Patient )ctx.getBean("patient");
		System.out.println(p);
		ctx.registerShutdownHook();
	}
}
