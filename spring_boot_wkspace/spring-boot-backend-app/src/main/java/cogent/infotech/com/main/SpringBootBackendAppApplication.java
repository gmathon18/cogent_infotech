package cogent.infotech.com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.UserRepository;

@SpringBootApplication
public class SpringBootBackendAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendAppApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User("Gyanendra", "Singh", "gs@gmail.com"));
		this.userRepository.save(new User("John", "Anthony", "ja@gmail.com"));
		this.userRepository.save(new User("Mohammed", "Max", "max@gmail.com"));
	}

}
