
package in.com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TestMarksheet1  {
	public static void main(String[] args) throws Exception {
	
		
		  FileOutputStream file = new FileOutputStream("c:/java.test/purva.txt");
		  ObjectOutputStream out = new ObjectOutputStream(file);
		  
		Marksheet m = new Marksheet();
		m.setId(12);
		m.setName("purva");
		m.setSubject("java");
		  
		out.writeObject(m);
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getSubject());
		 
		
		
		
	
	FileInputStream file1 = new FileInputStream("c:/java.test/purva.txt");
	ObjectInputStream oute= new ObjectInputStream(file1);
	
	
Marksheet	s=(Marksheet) oute.readObject();
	System.out.println(s.getId()+""+s.getName()+""+s.getSubject());
	
	file.close();
	out.close();
	file1.close();
	oute.close();
	
	}

}
