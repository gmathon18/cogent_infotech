package cogent.collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class BookDemo {

	public static void main(String [] args) {
		
		Scanner sv = new Scanner(System.in);
		List<Book> library = new ArrayList<Book>();
		BookDAO dao = new BookDAO(library);
		
		int choice = -1;
		do {
		System.out.println("---------WELCOME TO THE LIBRARY DATABASE---------\n");
		System.out.println("-------************ MENU ************-------------");
		System.out.println("-------1. Add A Book");
		System.out.println("-------2. Update A Book");
		System.out.println("-------3. Delete A Book");
		System.out.println("-------4. Find A Book");
		System.out.println("-------5. Print Book Details");
		System.out.println("-------6. Exit");
		System.out.println("-------******************************-------------");
		
		choice = sv.nextInt();
		
		switch(choice) {
		
		case 1:
				dao.createBook();
				break;
		
		case 2:
				System.out.println("Please enter the id of the book to update");
				dao.updateBook(sv.next());
				break;
				
		case 3:
			System.out.println("Please enter the id of the book to delete");
			dao.deleteBook(sv.next());
			break;
			
		case 4:
			System.out.println("Please enter the id of the book to find");
			dao.findBook(sv.next());
			break;
			
		case 5:
			System.out.println("Printing library........");
			dao.printBookDatabase();
			break;
		
		case 6:
			System.out.println("Thank you for visiting the library. Goodbye!");
			choice = 6;
			break;
		}
	}while(choice != 6 );
	}
}
