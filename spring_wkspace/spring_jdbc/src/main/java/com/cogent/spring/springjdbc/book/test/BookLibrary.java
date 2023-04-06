package com.cogent.spring.springjdbc.book.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cogent.spring.springjdbc.book.dao.rowmapper.BookDAO;
import com.cogent.spring.springjdbc.book.dto.Book;

import java.util.List;
import java.util.Scanner;

public class BookLibrary {

	public static void main(String [] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cogent/spring/springjdbc/book/test/config.xml");
		BookDAO dao = (BookDAO) ctx.getBean("bookDAO");

		
		// BEGIN EXECUTION OF CRUD APPLICATION
		
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		
		do {
			
			System.out.println("********** WELCOME TO THE LIBRARY *********");
			System.out.println("******************* MENU *******************");
			System.out.println("1. Add Book");
			System.out.println("2. Look up a Book");
			System.out.println("3. Look up entire library");
			System.out.println("4. Update a Book");
			System.out.println("5. Delete a Book");
			System.out.println("6. Exit Library");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
					System.out.println("Please enter number of Books to add ");
					int numToCreate = sc.nextInt();
					
					for(int i =0; i<numToCreate;i++) {
						
						Book newBook = new Book();
						System.out.println("Enter a book name");
						newBook.setName(sc.next());
						System.out.println("Enter the book price");
						newBook.setPrice(sc.next());
						System.out.println("Enter the book id");
						newBook.setId(sc.nextInt());
						
						int j = dao.create(newBook);
						if(j>0) {
							System.out.println("Book added successfully");
						}
					}
					break;
					
			
			case 2:
					System.out.println("Please enter the id of Book to look up");
					int id = sc.nextInt();
					Book b = dao.read(id);
					if(b!= null) {
						System.out.println(b);
					}
					break;
					
					
			case 3:
					System.out.println("Displaying entire library collection......");
					List<Book> lib = dao.read();
					for(Book book: lib) {
						System.out.println("\nBook Name: "+book.getName());
						System.out.println("Book Price: "+book.getPrice());
						System.out.println("Book Id:" + book.getId());
					}
					System.out.println("\nDone displaying entire library collection......\n");
					break;
					
					
			case 4: 
				
					Book newBook = new Book();
					System.out.println("Enter the book id");
					newBook.setId(sc.nextInt());
					System.out.println("Enter update book name");
					newBook.setName(sc.next());
					System.out.println("Enter the updated book price");
					newBook.setPrice(sc.next());
					System.out.println("Enter the updated book id");
				
					int s = dao.update(newBook);
					if(s>0) {
						System.out.println("Book updated successfully");
					}else {
						System.out.println("Book not found! ");
					}
					break;
					
					
			case 5: 
					System.out.println("Please enter id of book to remove from library");
					int res = dao.delete(sc.nextInt());
					if(res>0) {
						System.out.println("Book removed successfully! ");
					} else {
						System.out.println("Book not found! ");
					}
					break;
					
					
			case 6: 
					System.out.println("Thank you for visiting the library! Good Bye !");
					sc.close();
					((AbstractApplicationContext) ctx).close();
					System.exit(0);
					break;
			
		
			}
			
			
			
		} while(choice != 6);
	}
}

