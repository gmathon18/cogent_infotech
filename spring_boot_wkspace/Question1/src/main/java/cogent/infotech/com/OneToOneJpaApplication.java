package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Passport;
import cogent.infotech.com.entity.Employee;
import cogent.infotech.com.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneJpaApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(OneToOneJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee = new Employee();
		employee.setName("John");
		employee.setEmail("john@gmail.com");
		
		Passport passport = new Passport();
		passport.setExpiry("24-07-2024");
		passport.setAddress("New york");
		
		employee.setPassport(passport);
		
		repository.save(employee);
		System.out.println("Employee details are saved successfully");
		
	}

}
