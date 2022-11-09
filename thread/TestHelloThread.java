package in.com.rays.thread;

public class TestHelloThread  {
	
	
	

	public static void main(String[] args) {
		
		HelloThread t1= new HelloThread("rupali");
		HelloThread t2 = new HelloThread("ritika");
		
			
		t1.start();
		t2.start();
	
		
		for( int i =0;i<50;i++) {
		System.out.println("main");	
		}
		
		}
	}


