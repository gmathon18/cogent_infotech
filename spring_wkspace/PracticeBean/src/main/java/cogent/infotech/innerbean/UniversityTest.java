package cogent.infotech.innerbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniversityTest {

	public static void main(String[] args) {
	

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		University u1  = (University) ctx.getBean("university");
		University u2  = (University) ctx.getBean("university");

		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}

}
