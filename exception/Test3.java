package in.com.rays.exception;

public class Test3 {
	
	public static void main(String[] args) throws LoginException3 {
		auth("ram");
	
	}
	private static void auth(String user) throws LoginException3  {
	
		
		if(!user.equals("Admin")) {
		LoginException3 e = new LoginException3() ;
			
			throw e;
		}
	}
	
	}
