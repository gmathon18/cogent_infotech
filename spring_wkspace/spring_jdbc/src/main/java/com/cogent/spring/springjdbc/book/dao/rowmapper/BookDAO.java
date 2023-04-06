package com.cogent.spring.springjdbc.book.dao.rowmapper;

import java.util.List;

import com.cogent.spring.springjdbc.book.dto.Book;

public interface BookDAO {

	
	int create(Book b);
	int update(Book b);
	int delete(int id);
	Book read(int id);
	List<Book> read();
	
}
