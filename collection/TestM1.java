package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class TestM1 {
	
	public static void main(String[] args) {
		
		Marksheet1 a1 = new Marksheet1();
		
		a1.setRollnumber("2");
		a1.setFname("ram");
		a1.setLname("jain");
		a1.setMaths(34);
		a1.setPhysics(57);
		a1.setChemstry(60);
		
		Marksheet1 a2 = new Marksheet1();
		
		a2.setRollnumber("3");
		a2.setFname("vijay");
		a2.setLname("sharma");
		a2.setMaths(70);
		a2.setPhysics(62);
		a2.setChemstry(46);

		Marksheet1 a3 = new Marksheet1();
		
		a3.setRollnumber("5");
		a3.setFname("sujoy");
		a3.setLname("jain");
		a3.setMaths(73);
		a3.setPhysics(63);
		a3.setChemstry(36);

		ArrayList list = new ArrayList();
		list.add(a1);
		list.add(a2);
	    list.add(a3);
	    
		Collections.sort(list);
		
    Iterator it = list.iterator();
    
    while (it.hasNext()) {
		Marksheet1 o  = (Marksheet1) it.next();
		System.out.println(o.getRollnumber()+" "+o.getFname()+" "+o.getLname()+" "+o.getMaths()+" "+o.getPhysics()+" "+o.getChemstry());
	}
		
		
	
	}

}
