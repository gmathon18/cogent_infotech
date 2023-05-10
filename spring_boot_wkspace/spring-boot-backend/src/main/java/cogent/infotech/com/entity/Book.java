package cogent.infotech.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String bookName;
	private String bookPrice;
	
	public Book() {
		
		
	}

	public Book(String bookName, String bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
