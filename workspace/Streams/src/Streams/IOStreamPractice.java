package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamPractice {

	public static void main(String [] args) {
		
		FileInputStream testFile = null;
		FileOutputStream writeFile = null;
		
		
		FileReader  originFile = null;
		FileWriter  newFile = null;
		try {
			
			testFile = new FileInputStream("/Users/gurmail/cogent/workspace/Streams/src/Streams/employeee.txt");
			writeFile = new FileOutputStream("/Users/gurmail/cogent/workspace/Streams/src/Streams/new_employee.txt");
			int i;
			while((i = testFile.read())!= -1) {
				
				writeFile.write(i);
			}
			System.out.println("File Successfully Copied from FileInputStream to FileOutputStream");
			
			
			originFile = new FileReader("/Users/gurmail/cogent/workspace/Streams/src/Streams/employeee.txt");
			newFile = new FileWriter("/Users/gurmail/cogent/workspace/Streams/src/Streams/next_employeee.txt");
			
			int j;
			while((j = originFile.read())!= -1) {
				
				newFile.write(j);
			}
			
			System.out.println("File Successfully Copied from FileReader to FileWriter");
			
		} catch(Exception e) {
			System.out.println("Error reading file " + e);
		}finally {
			try {
				
			
			testFile.close();
			writeFile.close();
			originFile.close();
			newFile.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	}
		
}
