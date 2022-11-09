package in.com.rays.thread;

public class TestRunable  {
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread ( new HelloRunable("ram"));
		Thread t2 = new Thread( new HelloRunable("rupali"));


		t1.start();
		t2.start();
			
	
	
	for(int i = 0;i<50;i++) {
	
	System.out.println(i+"main");	
	
	
	}
}
}