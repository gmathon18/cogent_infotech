package cogent.infotech.com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

		public static void main(String [] args) {
			
			ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			Person p = (Person) context.getBean("person");
			System.out.println("Person name is: "+p.getName());
			System.out.println("Person age is: "+p.getAge());
			
		
			Product product = (Product) context.getBean("product");
			System.out.println("\nProduct id is: "+product.getpId());
			System.out.println("Product price is: "+product.getpPrice());
			System.out.println("Product name is: "+product.getpName());
		}
}
