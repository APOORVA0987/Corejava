package in.com.rays.ExersizelemdaEx;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;





public class StreamEx2 {
	public static void main(String[] args) {
		
		List<String>list =Arrays.asList("java","python","dbms","dotnet");
		
		Map<Integer,String> map= new HashMap();
		map.put(1, "java");
		map.put(3, "python");
		map.put(2, "dbms");
		map.put(4, "dotnet");
		
		list.stream().sorted().forEach(e->System.out.println(e));
	}
	}
		
   
