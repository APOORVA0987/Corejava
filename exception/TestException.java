package in.com.rays.exception;

public class TestException {
	
	public static void main(String[] args) {
		
		int i= 17;
		int j = 0;
	try {	
		double div = i/j;
		
		System.out.println(div);
		
	}catch(ArithmeticException E) {
		System.out.println(" zero se divid ni kr skte");
	}
	}

}
