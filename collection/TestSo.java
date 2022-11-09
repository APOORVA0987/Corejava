package in.com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestSo {
	

	

	public static void main(String[] args) {
	
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(34);
		a.add(25);
		a.add(10);
		a.add(5);
		
		Collections.sort(a);
		System.out.println(a);
		
	}

}

