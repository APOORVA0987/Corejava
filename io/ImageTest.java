package in.com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageTest {
	
	public static void main(String[] args) throws IOException {
		
	  String source ="C:\\Users\\apoor\\OneDrive\\Documents\\panda.png";
	  String target ="C:\\Users\\apoor\\OneDrive\\Documents\\moon.png"; 
	  FileInputStream reader = new FileInputStream(source);
	  FileOutputStream writer=new FileOutputStream(target);
	  
	  int ch = reader.read();
	  while(ch!=-1) {
		 
		writer.write(ch);
		
		ch=reader.read();
	  }
	 
	  writer.close();
	  reader.close();
	  
	}
}
