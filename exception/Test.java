package in.com.rays.exception;

public class Test  {
	public static void main(String[] args)  {
		//LoginException e = new LoginException();
		int i = 0;
		if(i<1) {
			LoginException e = new LoginException();
			try {
				throw e; //raise
			}catch(LoginException a) {
				System.out.println(a.getMessage());
				a.printStackTrace();
			}
		}else {
			System.out.println("yes");
		}
		}
	
	
		}

		

	

