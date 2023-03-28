package Serialization;
import java.io.EOFException;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationProgram {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("/Users/gurmail/cogent/workspace/Streams/src/Streams/Student.ser");
			ois = new ObjectInputStream(fis);
			for(;;) {
			Object obj = ois.readObject();
			
			Student s = (Student)obj;
			System.out.println("The student name is "+s.name);
			System.out.println("The student age is "+s.age);
			System.out.println("The student address is "+s.address);
			System.out.println("The student roll No is "+s.rollNo+"\n");
			}
			}
		 catch(EOFException e) {
			 
			System.out.println("Objects displayed successfully");
			
		}catch(Exception e)
		{ 
			e.printStackTrace();
		}
		
		finally {
		
			
			try {
				
				fis.close();
				ois.close();
				} catch (IOException e) {
				
				e.printStackTrace();
				
				}
		}
	}
}

