package cogent.sorting;
import java.util.Scanner;

public class TestHashMap {

		public static void main(String [] args) {
			
			Student st = new Student();
			
			System.out.println("Please enter the number of students to add");
			Scanner sc = new Scanner(System.in);
			
			int j = sc.nextInt();
			
			
			for(int i = 0; i<j;i++) {
				st.setNames();
			}
			
			st.printNames();
			
			//Test Case: Roll No 123
			st.getName("123");
			
			st.printNamesKeySet();
			
			st.printSize();

		}
}
