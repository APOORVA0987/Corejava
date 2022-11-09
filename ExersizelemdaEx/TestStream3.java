package in.com.rays.ExersizelemdaEx;

import java.util.Arrays;
import java.util.List;


public class TestStream3 {
	
	public static void main(String[] args) {
		/*
		 * List<Integer> list = Arrays.asList(4,5,5,8,6,6,6,9);
		 * list.stream().filter(e->e==6).forEach(e->System.out.println(e));
		 */	
		
		List<String>list =Arrays.asList("java","rays","paython");
	     list.stream().map(e -> e.toUpperCase()).limit(2).forEach(e -> System.out.println(e));
	}
}
