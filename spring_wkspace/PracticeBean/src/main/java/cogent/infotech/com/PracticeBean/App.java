package cogent.infotech.com.PracticeBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee)ctx.getBean("employee");
		System.out.println(emp);
		ctx.registerShutdownHook();
    }
}
