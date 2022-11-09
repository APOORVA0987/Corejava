package in.com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWriteA {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fr = new FileWriter("c:/java.test/purva.txt",true);
		
		fr.write('a');
		fr.write("poorva...........");
		System.out.println("done");
		fr.close();
	}

}
