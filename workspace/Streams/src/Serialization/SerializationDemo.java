package Serialization;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationDemo {

	public static void main(String [] args) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("/Users/gurmail/cogent/workspace/Streams/src/Streams/Student.ser");
			oos = new ObjectOutputStream(fos);
			Scanner sc = new Scanner(System.in);
			System.out.println("Would you like to add a Student? 1. Yes 2. No");
			int choice = sc.nextInt();
			
			while(choice != 2) {
				
				System.out.println("Please enter Student age");
				int age = sc.nextInt();
				System.out.println("Please enter Student Roll No");
				int number = sc.nextInt();
				System.out.println("Please enter Student Roll Name");
				String studName = sc.next();
				System.out.println("Please enter Student Roll Address");
				String studAddress = sc.next();
				Student s  = new Student(age, number, studAddress, studName);
				oos.writeObject(s);
				System.out.println("Student successfully added");
				
				System.out.println("Would you like to add another student? 1. Yes 2.No");
				choice = sc.nextInt();
			}
			sc.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				
				fos.close();
				oos.close();
				System.out.println("files successfully closed");
				System.exit(0);
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
		}
	}
	
}
