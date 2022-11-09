package in.com.rays.thread;

public class HelloThread extends Thread {
	
	String name = null;
	
	public HelloThread(String n) {
	
	this.name = n;
	}
	

	public HelloThread() {
		// TODO Auto-generated constructor stub
	}
		public void run() {
		for(int i = 0;i<50;i++)	{
			System.out.println(i+name);
		}
		
	}
}