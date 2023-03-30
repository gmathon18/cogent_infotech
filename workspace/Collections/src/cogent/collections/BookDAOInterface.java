package cogent.collections;

public interface BookDAOInterface {

	
	public void createBook();
	
	public void updateBook(String var);
	
	public void deleteBook(String var);
	
	public void findBook(String var);
	
	public void printBookDatabase();
}
