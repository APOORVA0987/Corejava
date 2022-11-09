package in.com.rays.io;

import java.io.File;

public class Atribute {
	
	public static void main(String[] args) {
		
	File f = new File("c:/java.test/purva.txt")	;
	
	System.out.println(f.getName());
	System.out.println(f.getAbsolutePath());
	System.out.println(f.canWrite());
	System.out.println(f.canRead());
	System.out.println(f.isFile());
	System.out.println(f.isDirectory());
	System.out.println(f.lastModified());
	System.out.println(f.length());
	}

}
