package in.com.rays.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
	
	public static void main(String[] args) {
		
	//	List<Integer> list =Arrays.asList(2,4,5,7,7,8,6,6,9);
		
	//	list.stream().distinct().sorted().forEach(li ->System.out.println(li));
		
		List<Integer>list = Arrays.asList(2,4,5,7,7,8,6,6,9);
	List<Integer>li = 	list.stream().distinct().sorted().collect(Collectors.toList());
			
		}
	}


