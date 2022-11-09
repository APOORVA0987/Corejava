package in.com.rays.collection;

import java.util.Enumeration;
import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		
		Stack S = new Stack();
		
		S.push(1);
		S.push(2);
		S.push(3);
		S.push(4);
		
	//	Enumeration e = S.elements() ;
		//while(e.hasMoreElements()) {
		//	System.out.println(e.nextElement());
		//}
	//	S.add(6);
	//	System.out.println(S);
	
	S.pop();
		
	System.out.println(S);
	}

}
