package in.com.rays.java8;

public class  TestCal {
	
	public static void main(String[] args) {
		Calculation add =(a,b)->{
			
		
			System.out.println(a+b);
		};add.cal(30,20);
		
		Calculation sub = (a,b)->{
			System.out.println(a-b);
		} ;sub.cal(50, 30);
		Calculation mul = (a,b)->{
			System.out.println(a*b);
		};mul.cal(20, 10);
	}
			  

			  
		  
		}


