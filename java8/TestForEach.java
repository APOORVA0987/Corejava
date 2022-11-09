package in.com.rays.java8;

import java.util.ArrayList;

public class TestForEach {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 list.forEach(li->System.out.println(li));
		 
	}

}
