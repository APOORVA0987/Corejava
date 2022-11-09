package in.com.rays.exception;

public class TestException4 {
	public static void main(String[] args) {
		
		int i= 17;int j = 0;
		
      try {	
    	  try {
    		  double div = i/j;
            System.out.println(div);
	
          }catch(ArithmeticException E) {
	        System.out.println(" zero se divid ni kr skte");}
          
      }catch (Exception e)  {
             try {
            	 String s = null;
            	 System.out.println(s.length());
             }catch(NullPointerException a) {
            	 System.out.println("String null h");}
      }finally {
    	  String name = "purva";
    	        try {
    	    	System.out.println(name.charAt(7));
    	        }catch(IndexOutOfBoundsException b) {
    	        	System.out.println("String chota h");
    	        }
    	      
    	        System.out.println("finally");
      }
             

    	  
    	  
		/*String name = "vijay";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
	}*/
      }
      
  }
