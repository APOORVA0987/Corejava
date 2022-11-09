package in.com.rays.thread;

public class HelloRunable implements Runnable {

	
	
	String name = null;
	public HelloRunable(String n) {
	
		this.name = n;
	}
	@Override
	public void run() {
		for(int i = 0 ;i <50;i++) {
		System.out.println(i+" "+name);	
		}
		
	}

}
