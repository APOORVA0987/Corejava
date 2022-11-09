
package in.com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List l = new ArrayList();
		Marksheet m = new Marksheet();
		Marksheet m1 = new Marksheet();
		m.setRollnumber("101");
		m.setName("ram");
		m.setPhysics(35);
		m.setMaths(65);
		m.setChamistry(50);
		
		m1.setRollnumber("111");
		m1.setName("vijay");
		m1.setPhysics(45);
		m1.setMaths(70);
		m1.setChamistry(40);
		
		l.add(m);
		
		
		//System.out.println(l.contains(m1));
		//System.out.println(l.remove(m1));
		System.out.print(l);
		

		
	}

}
