package in.com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
	
	public static void main(String[] args) {
		List li = new ArrayList();
		
		li.add(4);
		li.add(8);
		li.add(3);
		li.add(7);
		li.remove(2);
	System.out.println(li);	
	
	System.out.println(li.size());	
	System.out.println(li.iterator());	
	System.out.println(li.isEmpty());
		System.out.println(li.contains(4));
		
		System.out.println(li);
		for (Object o : li) {
			System.out.println(o);
		}
		List a = new ArrayList();
		a.add(36);
		a.add(2);
		a.add(5);
		a.addAll(li);
		
		System.out.println(a);	
		System.out.println(li.containsAll(a));	
		System.out.println(a.retainAll(li));
			
	
		
		}
	
}
    