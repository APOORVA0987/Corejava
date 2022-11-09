package in.com.rays.exersize;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int no = 122;
		int temp = no;
		int rev = 0,rem;
		while(temp!=0);{
		rem = no%10;
		rev = rev*10+rem;
		temp = temp/10;
	}
	
        if(no==rev) {
        System.out.println("no+ is palindrome number");
	
	}else {
System.out.println(no+"is not polindrome number");
}
}
}