package in.com.rays.oop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestStream2 {
	
	

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(4,6,8,8,3,5,5,5,2);
		
		
		List<Integer> li =list.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li);
	} 

}
