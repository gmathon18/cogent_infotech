package Streams;

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOAssignmentOne {

	public static void main(String [] args) {
		
		
		if(args.length < 2) {
			System.out.println("Insufficient command line arguments provided");
			return;
		}
		
		
		FileReader  originFile = null;
		FileWriter  newFile = null;
		
		try {
			
			originFile = new FileReader(args[0]);
			File f = new File(args[1]);
			Scanner sc = new Scanner(System.in);
			
			if(f.exists()) {
				System.out.println("The file alreadys exists. Would you like to overwrite?");
				System.out.println("1. Yes");
				System.out.println("2. No");
			}
			int choice = sc.nextInt();
			if(choice == 1) {
				
			
			newFile = new FileWriter(args[1]);
			
			int j;
			
			while((j = originFile.read())!= -1) {
				
				newFile.write(j);
			}
			
			System.out.println("File Successfully Copied from FileReader to FileWriter");
			}
			sc.close();
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				
			
			originFile.close();
			newFile.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	}
		
}
