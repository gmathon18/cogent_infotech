import java.util.Scanner;

public class TestRectangle {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle [] r = new Rectangle[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Please enter desired integer length of Rectange "+i);
			int l = sc.nextInt();
			System.out.println("Please enter desired integer length of Rectange "+i);
			int b = sc.nextInt();
			r[i] = new Rectangle(l,b);
		}
		
		for(Rectangle rec : r) {
			rec.display();
		}
	}
}
