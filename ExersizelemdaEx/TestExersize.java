package in.com.rays.ExersizelemdaEx;

public class TestExersize {
	
	public static void main(String[] args) {
		Exersize414  e =()->{
			   
			int []arr = {2,5,7,9} ;int b = 0;
			
			int c = arr[0]; 
			for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>0) {
					
					b=c;
					c = arr[i];
					
				}
				
			}System.out.println(c+"sec lar="+b);
			
		};e.LargestNumber();
		
		}
			
	}

