package newFile.reading.injava;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingNewFileMain {

	public static void main(String[] args) throws Exception {
		
		FileReader reader = new FileReader("F:\\Java Reading, Writing and Creating files\\Musa1.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String txt = "";
		String line = br.readLine();
		
		while (line != null) {
			
			txt += line;
			line = br.readLine();
		}
		
		System.out.println(txt);
	}

}
