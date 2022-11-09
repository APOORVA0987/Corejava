package in.com.rays.exception;

public class Test2 {


	public static void main(String[] args) {
		
	
	
	auth("Vijay");	

	}

	private static void auth(String user) {
		// TODO Auto-generated method stub
		
		if(!user.equals("Admin")) {
			LoginException e= new LoginException();
			try {
				throw e;
			} catch (LoginException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println(e.getMessage());
			}
		
			
		}
		
		
	}
}

