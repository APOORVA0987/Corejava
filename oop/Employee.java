package in.com.rays.oop;

public class Employee  extends Person2{
	
	private int sal=0;
	public Employee() {
		
	}
	
	public Employee(String fm,String ln,String add,int d) {
		
		super(fm,ln,add);
	super.changeAddress();
		sal=d;
		System.out.println("child cuns sal"+sal);
		
	}

}
