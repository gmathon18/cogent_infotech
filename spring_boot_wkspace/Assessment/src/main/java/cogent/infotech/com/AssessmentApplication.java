package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.repository.UserRepository;
import cogent.infotech.com.entity.User;


@SpringBootApplication
public class AssessmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("Max",24,"340,000"));
		this.userRepository.save(new User("Harry",25,"300,000"));
		this.userRepository.save(new User("Marshall",32,"500,000"));
		
	}
}
