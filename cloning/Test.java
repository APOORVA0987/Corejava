package in.com.rays.cloning;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a = new Address();
		a.setState("MP");
		a.setCity("indore");
		
		Employee e = new Employee();
		e.setId(4);
		e.setName("ram");
		e.setAddress(a);
		
		Employee e1 = (Employee)e.clone();
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAddress().getState());
		System.out.println(e.getAddress().getCity());
		
		
		System.out.println("............");
		
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getAddress().getState());
		System.out.println(e1.getAddress().getCity());
		
	}

}
