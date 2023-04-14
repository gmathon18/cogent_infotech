package cogent.infotech.com.service;

import java.util.List;

import cogent.infotech.com.entity.Book;

public interface BookService {

	public Book save(Book book);
	public List<Book> readLibrary();
	public Book update(Book book);
	public void delete(Book book);
}
