package in.com.rays.oop;

public class Square extends Shape {

	
	private int base;
	
	public  Square() {}
		public  Square(int a) {
		
		base = a;
		
			
		}
	

	public int getBase() {
		return base;
	}
	public double area() {
		return 2*base*base;
	}
	
}
