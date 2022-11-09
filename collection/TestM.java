package in.com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestM {
	
	public static void main(String[] args) {
	
		Map m = new HashMap();
		m.put(1," java");
		m.put(2," c");
		m.put(3, "c++");
		
	//	System.out.println(m);
	//m.clear();
	System.out.println(	m.containsKey(7));
	System.out.println(m.containsValue(" java"));
	System.out.println(m.entrySet());
	System.out.println(m.get(3));
	System.out.println(m.isEmpty());
	
	System.out.println(m.keySet());
	
	System.out.println(m.size());
	System.out.println(m.values());
	System.out.println(m.remove(1));
	System.out.println(m);
	}

}
