package cogent.infotech.assessment;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.assessment.repository.MovieRepository;
import cogent.infotech.assessment.repository.UserRepository;
import cogent.infotech.assessment.entity.User;
import cogent.infotech.assessment.entity.Movie;

@SpringBootApplication
public class CodingAssessmentApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(CodingAssessmentApplication.class, args);
	}

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	MovieRepository movieRepo;

	
	@PostConstruct
	public void initUser() {
		List<User> users = new ArrayList<>();
		users.add(new User(100,"gurmail","password","gurmail@gmail.com"));
		users.add(new User(101,"gyanendra","password","gyanendra@gmail.com"));
		userRepo.saveAll(users);
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1,"jaws","horror",2,"April"));
		movies.add(new Movie(1,"balloons","comedy",3,"May"));
		
		movieRepo.saveAll(movies);
		
	}
}
