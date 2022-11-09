package in.com.rays.exception;


public class Exception1 {
	public static void main(String[] args) {
		int i= 17 ;
		int j = 0;
		try {
			try { int c=17/0;
			System.out.println(c);
			}catch(RuntimeException e) {
				System.out.println("zero se divid nhi hota he");
			}
			}catch(Exception e1 ) {
				System.out.println("Me sundar hu");
			}try {
				String S = null;
				System.out.println(S.charAt(5));
			}catch( NullPointerException e2) {
				System.out.println("String null he");
				
			}finally {
				try {
				String Name = "Ram";
				System.out.println(Name.charAt(6));
				
			}catch(Exception e2) {
				System.out.println("String abhi choti he");

			}
			}
		}
}
		
	
	

