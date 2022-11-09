package in.com.rays.exception;

public class TestException3 {
	
	public static void main(String[] args) {
		 String name ="vijay";
	try {
	     System.out.println(name.length());
		 System.out.println(name.charAt(3));
	} catch(StringIndexOutOfBoundsException e) {
		System.out.println("Strig abhi choti he");
	} catch(NullPointerException e1) {
		System.out.println("sundar sa name nhi he");
	}finally {
		System.out.println( "Hiroin hu me");
	}
	 
	}
}
