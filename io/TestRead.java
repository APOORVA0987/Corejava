package in.com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestRead {
	
	public static void main(String[] args) throws Exception {
		
		FileReader Reader = new FileReader("c:/java.test/purva.txt");
		
		int ch = Reader.read();
		
		while(ch!= -1) {
	
		System.out.println((char)ch);
		
		ch = Reader.read();
		}
		Reader.close();
	}
   
}
