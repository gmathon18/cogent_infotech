package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.BookRepository;

@SpringBootApplication
public class SpringBootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.bookRepository.save(new Book("MathBook","34.00"));
		this.bookRepository.save(new Book("HistoryBook","30.00"));
		this.bookRepository.save(new Book("ScienceBook","31.00"));
		
	}

}
