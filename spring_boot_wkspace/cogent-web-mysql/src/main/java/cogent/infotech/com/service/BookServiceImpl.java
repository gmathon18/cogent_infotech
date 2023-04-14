package cogent.infotech.com.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cogent.infotech.com.entity.Book;

import cogent.infotech.com.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepo;
	
	@Override
	public Book save(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public List<Book> readLibrary() {
		
		return (List<Book>)bookRepo.findAll();
	}

	@Override
	public Book update(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public void delete(Book book) {
		
		bookRepo.delete(book);
	}

	
}
