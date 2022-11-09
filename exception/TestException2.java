package in.com.rays.exception;

public class TestException2 {
	public static void main(String[] args) {
		
		String name ="rays";
	
		try {
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		}
		catch(NullPointerException e)
		{
			System.out.println("you string is null");
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("your string is short");
		}
	
	finally {
		System.out.println("Sundar name he");
	}
		
}
}

