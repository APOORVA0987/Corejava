package in.com.exersize;

public class PrimeOrNot {
	
	public static void main(String[] args) {
	
		int no=7; 
		int temp=0;
		for(int i=2;i<=no-1;i++) {
			
			if(no%i==0) {
				temp=temp+1;
		
			}
		}
		if(temp==0) {
			
			
		
		System.out.println(no+"is prim no");
		
		}
	else {
		System.out.println(no+"is not prim no");
	}
	}
}