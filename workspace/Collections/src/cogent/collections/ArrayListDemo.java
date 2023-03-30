package cogent.collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		Student db = new Student();

		db.setNames();
		db.searchName("bob");
		db.searchName(1);
		db.printNames();
		db.removeName("bob");
		db.printNames();
	}

}