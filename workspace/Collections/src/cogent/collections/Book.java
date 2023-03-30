package cogent.collections;

public class Book {

	String bookId;
	String bookName;
	double bookPrice;
	
	public Book() {
		
		this.bookId = "";
		this.bookName = "";
		this.bookPrice = 0;
	}
	
	public Book(String id, String name, double price) {
		
		this.bookId = id;
		this.bookName = name;
		this.bookPrice = price;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
}
