package in.com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestE {
	public static void main(String[] args) throws Exception {
		
		 FileOutputStream file = new FileOutputStream("c:/java.test/purva.txt");
		  ObjectOutputStream out = new ObjectOutputStream(file);
		  
		Employee m = new Employee();
		m.setId(12);
		m.setFname("ravi");
		m.setLname("sharma");
		  
		m.writeExternal(out);
		
		 
		
	
	FileInputStream file1 = new FileInputStream("c:/java.test/purva.txt");
	ObjectInputStream oute= new ObjectInputStream(file1);
	
	
     m.readExternal(oute);
	System.out.println(m.getId()+""+m.getFname()+""+m.getLname());
	
	file.close();
	out.close();
	file1.close();
	oute.close();
	
	}

}
