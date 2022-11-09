package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {
	
	public static void main(String[] args) {
		
		Asinment a1 = new Asinment();
		a1.setFname("ram");
		a1.setLname("verma");
		
		Asinment a2 = new Asinment();
		a2.setFname("ram");
		a2.setLname("Sharma");
		
		Asinment a3 = new Asinment();
		a3.setFname("ramesh");
		a3.setLname("Sharma");

		Asinment a4 = new Asinment();
		a4.setFname("ram");
		a4.setLname("jain");

		ArrayList l = new ArrayList();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
		
		Collections.sort(l,new Asinment());
		Iterator it = l.iterator();
		while (it.hasNext()) {
			Asinment o = (Asinment) it.next();
			System.out.println(o.getFname()+" "+o.getLname());
			
		}
		
		
	}
	
	
	

}
