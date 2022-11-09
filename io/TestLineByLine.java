package in.com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestLineByLine {
	
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("c:/java.test/purva.txt");
		BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		reader.close();
	}

}