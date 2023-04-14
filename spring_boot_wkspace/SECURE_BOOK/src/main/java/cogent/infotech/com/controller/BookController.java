package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService library;
	
	@PostMapping("/books")
	public Book add(@RequestBody Book item) {
		
		return library.save(item);
	}
	
	@GetMapping("/books")
	public List<Book> fetchBookList(){
		return library.readLibrary();
	}
	
}
