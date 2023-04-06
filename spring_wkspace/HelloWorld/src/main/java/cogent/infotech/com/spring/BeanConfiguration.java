package cogent.infotech.com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration	
public class BeanConfiguration {

	@Bean(name="person")
	public Person getPerson()
	{
		Person p = new Person();
		p.setName("Anthony");
		p.setAge(20);
		return p;
	}
	
	@Bean(name="product")
	public Product getProduct()
	{
		Product pr = new Product();
		pr.setpId(45);
		pr.setpPrice(132.99);
		pr.setpName("Sony");
		return pr;
	}
}
