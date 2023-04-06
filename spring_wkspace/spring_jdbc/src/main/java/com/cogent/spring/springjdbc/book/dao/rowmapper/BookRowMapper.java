package com.cogent.spring.springjdbc.book.dao.rowmapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cogent.spring.springjdbc.book.dto.Book;



public class BookRowMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		
			Book e = new Book();
			e.setId(rs.getInt("ID"));
			e.setName(rs.getString("NAME"));
			e.setPrice(rs.getString("PRICE"));
			return e;
	}

}
