package in.com.rays.thread;

public class TestHelloNoThread {
	
	public static void main(String[] args) {
		
		HelloNoThread t1 = new HelloNoThread("ram");
		HelloNoThread t2 = new HelloNoThread("aman");
		
		t1.run();
		t2.run();
	}

}
