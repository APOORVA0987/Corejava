package in.com.rays.loops;

public class ReverseNumber {

	public static void main(String[] args) {

		int no =54321,rem,rev=0;
		while(no!=0) {
			rem=no%10;
			rev=rem;
			no=no/10;
		
			System.out.println(rev);
		}
	}
}

