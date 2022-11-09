package in.com.rays.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDq {
	
	public static void main(String[] args) {
		
		Deque d = new ArrayDeque();	
		
		d.add(12);
        d.add(15);
		d.add(34);
      d.add(76);
     //    System.out.println(d.getFirst());
      //   System.out.println(d.getLast());
        d.addFirst(0); 
		d.addLast(1);
		System.out.println(d);
}
}