package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestM2 {
	
	public static void main(String[] args) {
		
		Marksheet2 a1 = new Marksheet2();
		
		a1.setRollnumber("7");
		a1.setFname("rit");
		a1.setLname("gurjar");
		a1.setMaths(73);
		a1.setPhysics(82);
		a1.setChemstry(57);
		
	Marksheet2 a2 = new Marksheet2();
		
		a2.setRollnumber("56");
		a2.setFname("poja");
		a2.setLname("gupta");
		a2.setMaths(78);
		a2.setPhysics(82);
		a2.setChemstry(47);
		
Marksheet2 a3 = new Marksheet2();
		
		a3.setRollnumber("53");
		a3.setFname("rupali");
		a3.setLname("pirag");
		a3.setMaths(77);
		a3.setPhysics(52);
		a3.setChemstry(67);
		
		ArrayList list = new ArrayList();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		//System.out.println(list);
		Collections.sort(list , new Marksheet2());
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Marksheet2 o = (Marksheet2) it.next();
			System.out.println(o.getRollnumber()+" "+o.getFname()+" "+o.getLname()+" "+o.getMaths()+" "+o.getPhysics()+" "+o.getChemstry());
			
		}
	}

}
