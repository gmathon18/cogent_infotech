package cogent.infotech.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        //Exercise 1
       // Greeting g = (Greeting)ctx.getBean("hello");
        //String str = g.message();
        //System.out.println(str);
        
        //Exercise 2
        Employee g = (Employee)ctx.getBean("emp");
        System.out.println("Employee no: "+ g.getId());
        System.out.println("Employee name: "+ g.getName());
        
        
        //Exercise 3
       	Person p = (Person)ctx.getBean("person");
        System.out.println("\nEmployee no: "+ p.getId());
        System.out.println("Employee name: "+ p.getName());
        System.out.println("Employee age: "+ p.getAge());
        
        //Exercise 4
        Hospital h = (Hospital)ctx.getBean("hospital");
        System.out.println(h.getName());
        System.out.println(h.getDepartment());
    
        //Exercise 5
        Customer c = (Customer)ctx.getBean("customer");
        System.out.println("\n"+c.getProducts());
        
        //Exercise 6
        CarDealer d = (CarDealer)ctx.getBean("cardealer");
        System.out.println(d.getName());
        System.out.println(d.getModels().getClass().getName());
        System.out.println(d.getModels());
        
        //Exercise 7
        Student std = (Student) ctx.getBean("students");
        System.out.println("\n" +std);
    }
}

