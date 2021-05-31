package create.newfile.injava;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class CreateNewFileMain {

	public static void main(String[] args) {
		MRGazi1 address1 = new MRGazi1();
		
		File newFile = new File("F:\\Java Reading, Writing and Creating files\\Musa1.txt");
		
		try {
			
		if (newFile.exists()) {
			newFile.createNewFile();
			System.out.println("File Created Successfully");
			
		} else {
			System.out.println("There is a file in the same name");
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
		PrintWriter pw = new PrintWriter(newFile);
		
		pw.println("This is my java program in file writing");
		pw.println("-----------------------------------------");
		pw.println("java.io.File class can be used to create a new File in Java. When we "
				+ "initialize File object, we provide the file name and then we can call "
				+ "createNewFile() method to create new file in Java. \r\n" + 
				"\r\n" + "\nFile createNewFile() method returns true if new file is created "
						+ "and false if file already exists. This method also throws java.io."
						+ "IOException when it’s not able to create the file. The files created "
						+ "is empty and of zero bytes.\r\n" + 
				"");
		pw.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
