package in.com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Testkeyboard {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isReader = new InputStreamReader(System.in);
		
		BufferedReader in = new BufferedReader(isReader);
		PrintWriter out = new PrintWriter(new FileWriter("c:/java.test/purva.txt"));
		String line = in.readLine();
		while(!line.equals("quit")) {
		    out.print(line);
			line =in.readLine() ; 
		}
		in.close();
		out.close();
	}

}
