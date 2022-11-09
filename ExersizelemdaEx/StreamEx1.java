package in.com.rays.ExersizelemdaEx;

import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(4,6,6,6,8,7,9,9,9,1);
		
		list.stream().filter(e->e==6||e==9).forEach(e->System.out.println(e));
		
		//list.stream().filter(e->e==9).forEach(e->System.out.println(e));

	}

}
