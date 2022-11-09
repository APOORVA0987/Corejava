package in.com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class TestSc {
	
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("c:/java.test/purva.txt");
		Scanner Sc = new Scanner(reader);
		
		while(Sc.hasNext()) {
			System.out.println(Sc.nextLine());
		}
		Sc.close();
	}

}
