package in.com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestWrite {
	

	public static void main(String[] args) throws IOException {
		
		FileWriter fr = new FileWriter("c:/java.test/purva.txt");
		PrintWriter pw=new PrintWriter(fr);
		/*
		 * for(int i=1;i<=5;i++) { pw.println("line"); }
		 * 
		 */
		pw.print("apoorva");
		pw.close();
		fr.close();
	}

}
