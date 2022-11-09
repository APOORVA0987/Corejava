package in.com.rays.oop;

public class Rectangle extends Shape {
	
	private int length;
	
	private int width;
	
	
	public Rectangle() {
		
	}
	public Rectangle(int a, int b) {
		length=a;
		width=b;
	}
		
		public double area() {
			return length*width;
		}
		public int getLength() {
			return length;
		}
		
		public int getWidth() {
			return width;
		}
		
		
		
	}


