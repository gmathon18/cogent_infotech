package com.cogent.spring.springjdbc.book.impl;

import java.util.List;

import com.cogent.spring.springjdbc.book.dao.rowmapper.BookDAO;
import com.cogent.spring.springjdbc.book.dto.Book;
import com.cogent.spring.springjdbc.book.dao.rowmapper.BookRowMapper;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class BookDAOImpl implements BookDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Book b) {
		
		String sql ="insert into book value(?,?,?)";
		int result = jdbcTemplate.update(sql, b.getId(),b.getName(),b.getPrice());
		return result;
	}

	@Override
	public int update(Book b) {
		
		String sql = "update book set Name=?, Price=? where id=?";
		int result = jdbcTemplate.update(sql, b.getName(), b.getPrice(), b.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		
		String sql = "delete from book where id=?";
		int result= jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public Book read(int id) {
		
		String sql = "select * from book where id=?";
		BookRowMapper rowmapper = new BookRowMapper();
		Book b = null;
		try {
		 b = jdbcTemplate.queryForObject(sql, rowmapper, id);
		}catch(EmptyResultDataAccessException e) {
			System.out.println("No entry with given id found\n");
		}
		return b;
	}

	@Override
	public List<Book> read() {
		

		String sql = "select * from book";
		BookRowMapper rowmapper = new BookRowMapper();
		List<Book> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}
	
}

