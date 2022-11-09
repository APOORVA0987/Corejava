package in.com.rays.oop;

public class Test {
	
	public static void main(String[] args) {
		Richman rm = new Businessman();
		SocialWorker sw = new Businessman();
		sw.helpToOther();
		rm.donation();
		rm.earnmoney();
		rm.party();
	}

}
