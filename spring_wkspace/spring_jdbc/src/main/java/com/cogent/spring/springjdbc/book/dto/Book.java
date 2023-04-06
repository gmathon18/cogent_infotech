package com.cogent.spring.springjdbc.book.dto;

public class Book {

	private int id;
	private String name;
	private String price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String toString() {
		
		return "Book ID: " +id +" Book Name: " + name + " Book Price: " + price;
	}
}
