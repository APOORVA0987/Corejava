package in.com.rays.oop;

public class Circle2 {
	double PI = 3.14;
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double area() {
		return PI*radius*radius;
	}

}
