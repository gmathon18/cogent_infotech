package cogent.infotech.innerbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cogent.infotech.com.PracticeBean.Employee;

public class EmpTest {

		public static void main(String [] args) {
			
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
			Employee emp = (Employee)ctx.getBean("ouremployee");
			System.out.println(emp);
		}
}
