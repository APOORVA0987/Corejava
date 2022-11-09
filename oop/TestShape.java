package in.com.rays.oop;

public class TestShape {
	
	public static void main(String[] args) {
		
		Triangle T = new Triangle(5,8);
		
		Rectangle r=new Rectangle(6,7);
		
		Circle C = new Circle(9);
		
		Square S = new Square(4);
		Circle2 C2 =new Circle2();
		C2.setRadius(5);
		
		System.out.println(C2.getRadius());
		System.out.println("C2"+C2.area());
		
		r.setBorderwidth(6);
		r.setColor("red");
		
		T.setBorderwidth(8);
		T.setColor("green");
		
		System.out.println(C.area());
		
		
		
		
		System.out.println(T.getBorderwidth());
		System.out.println(T.getColor());
		
		System.out.println(r.getBorderwidth());
		System.out.println(r.getColor());
		
		System.out.println(T.area());
		
		System.out.println(r.area());

		System.out.println(S.getBase());
	}

}
