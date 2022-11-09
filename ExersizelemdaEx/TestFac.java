package in.com.rays.ExersizelemdaEx;

public class TestFac {
	public static void main(String[] args) {
		Exersize4  e = (int a) -> {
			
			int fact=1  ;
			
			for(int i=1;i<= a ;i++) {
			fact = fact * i;
			
			}
			System.out.println("fact. of : "+ a +" is :"+fact);	
			
		};e.Factorial(5);	
		
	}
}

