package cogent.collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDAO implements BookDAOInterface{

	List<Book> db;
	Scanner sc;
	
	public BookDAO(List<Book> bookDB) {
		
		this.db = bookDB;
		sc = new Scanner(System.in);
	}
	
	public void createBook() {
		
		System.out.println("Please enter title of Book");
		String bookName = sc.next();
		System.out.println("Please enter id of Book");
		String bookId = sc.next();
		System.out.println("Please enter price of Book (X.XX format accepted");
		Double bookPrice = sc.nextDouble();
		
		Book newBook = new Book(bookId, bookName, bookPrice);
		this.db.add(newBook);
		System.out.println("Book has been succesfully added to the Library");
	}
	
	public void updateBook(String bookID) {

		if (this.db != null) {

			for (Book b : this.db) {
				if (b != null) {
					if (b.getBookId().equals(bookID)) {

						System.out.println("Would you like to update book name? 1.Yes 2.No");
						if (sc.nextInt() == 1) {
							System.out.println("Please enter new title of Book");
							b.setBookName(sc.next());
						}
						System.out.println("Would you like to update book id? 1.Yes 2.No");
						if (sc.nextInt() == 1) {
							System.out.println("Please enter new id of Book");
							b.setBookId(sc.next());
						}
						System.out.println("Would you like to update book price? 1.Yes 2.No");
						if (sc.nextInt() == 1) {
							System.out.println("Please enter new price of Book (X.XX format accepted)");
							b.setBookPrice(sc.nextDouble());
						}

						return;
					}
				}
			}
			System.out.println("Book is not present in the library");
		}
	}

	
	
	public void deleteBook(String bookID) {
		
		if(this.db != null) {
			
		for(Book b: this.db) {
			if(b!=null) {
				if(b.getBookId().equals(bookID)) {
					this.db.remove(b);
					System.out.println("Book had been removed from the library");
					return;
				}
			}
			
		}
		System.out.println("Book is not present in the library");
	}
	}
	
	public void findBook(String bookID) {
		
		if(this.db != null) {
			
		for(Book b: this.db) {
			if(b!=null) {
				if(b.getBookId().equals(bookID)) {
					System.out.println("Book had been found in the library");
					return;
				}
			}
			
		}
		System.out.println("Book is not present in the library");
	}
   }
	
	public void printBookDatabase() {
		
		if(this.db.size() == 0) {
			System.out.println("No books in library database");
		}
		
		for(Book b: this.db) {
			
			System.out.println("Book name: " + b.getBookName());
			System.out.println("Book id: " + b.getBookId());
			System.out.println("Book price: " + b.getBookPrice());
			System.out.println("");
		}
	}
}
