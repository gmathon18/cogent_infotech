package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Comment;
import cogent.infotech.com.entity.Post;
import cogent.infotech.com.repository.PostRepository;

@SpringBootApplication
public class OneToManyJpaApplication implements CommandLineRunner{

	@Autowired
	PostRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(OneToManyJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	Post post = new Post("Cogent Infotech", "Cogent Infotech is IT company");
	Comment comment1 = new Comment("Good IT Company");
	Comment comment2 = new Comment("Its also a university known as Cogent University");
	Comment comment3 = new Comment("Informative");
	post.getComments().add(comment1);
	post.getComments().add(comment2);
	post.getComments().add(comment3);
	repository.save(post);
	System.out.println("Saved succesfully");
	}

}
