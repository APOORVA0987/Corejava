package in.com.rays.thread;

public class TestRaceAccount extends Thread{
	
	static Account s = new Account();
	
	private String name;
	
	public TestRaceAccount(String name) {
		this.name = name;
		
	}
		public void run() {
			
		for(int i =0; i<5;i++) {
	s.deposit(name, 1000);	

		}
		}
	public static void main(String[] args) throws InterruptedException {
		TestRaceAccount t1	= new TestRaceAccount("sheetal");
		TestRaceAccount t2 = new TestRaceAccount("vivek");
		
	


		t1.start();
		t2.start();

	}
}
