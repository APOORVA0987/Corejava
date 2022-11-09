package in.com.rays.oop;

public class Businessman  implements Richman,SocialWorker {

	@Override
	public void helpToOther() {
		System.out.println("helpToOther");
		
	}

	@Override
	public void earnmoney() {
		System.out.println( "earnmoney");
		
	}

	@Override
	public void donation() {
		System.out.println("donation");
		
	}

	@Override
	public void party() {
		System.out.println("party");
		
	}
	
	

}
