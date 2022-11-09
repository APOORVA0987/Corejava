package in.com.rays.oop;

public class TestO {
	
	
	public static void main(String[] args) {
		
		
		Shape []s = new Shape[4];
		
		s[0]=getShap(1);
		s[1]=getShap(2);
		s[2]=getShap(3);
		s[3]=getShap(4);
		double tot=0.0;
		tot=calarea(s);
		System.out.println("Totel area="+tot);
	}
	private static double calarea(Shape[] s) {
		double tot=0;
		for (int i = 0; i < s.length; i++) {
			
			 tot=s[i].area()+tot;
			System.out.println(s[i].getClass()+"Area ="+s[i].area());
		}
		return tot;
		
	}
	public static Shape getShap(int i) {
		
		if (i==1)return new Circle(5);
		if(i==2)return new Rectangle( 3,4);
		if(i==3 )return new Triangle(4,7);
		if(i==4) return new Square(5);
		return null;
	}
	
	
	
}