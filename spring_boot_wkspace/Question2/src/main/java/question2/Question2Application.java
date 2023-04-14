package question2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import question2.entity.Course;
import question2.entity.Student;
import question2.repository.StudentRepository;

@SpringBootApplication
public class Question2Application implements CommandLineRunner{

	@Autowired
	private StudentRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Question2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student rajesh = new Student("rajesh");
		Course c1 = new Course("Astronomy", "35.00");
		Course c2 = new Course("Mathematics", "89.00");
		Course c3 = new Course("Engineering", "95.00");
		rajesh.getCourses().add(c1);
		rajesh.getCourses().add(c2);
		rajesh.getCourses().add(c3);
		
		repo.save(rajesh);
		System.out.println("Saved successfully");
		
		Student jamshed = new Student("jamshed");
		Course c5 = new Course("Trigonometry", "38.00");
		Course c6 = new Course("Algebra", "56.00");
		Course c7 = new Course("English", "75.00");
		jamshed.getCourses().add(c5);
		jamshed.getCourses().add(c6);
		jamshed.getCourses().add(c7);
		repo.save(jamshed);
		System.out.println("Saved successfully again");
	}

}
