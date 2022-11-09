package in.com.rays.oop;

public class Person2 {
	
	private String FirstName ;
	private String LastName;
    private String Address;
	
	public Person2() {


		System.out.println(" Person2 default con");
	}	
		
		public Person2 (String FN,String LN) {
			this();
			FirstName = FN;
			LastName = LN;
			System.out.println("perent  Person2 2 params constructor "+FN+"  " +LN);
		

		}
		public Person2( String FN,String LN,String add) {
			this(FN,LN);
			Address =add;
			System.out.println( "parent 3 params constructure   "+FN+"  "+LN+Address);
		}
		public void changeAddress() {
			System.out.println("Person change Address");
		}
		
	public static void main(String[] args) {
	
		Employee p = new Employee( "ram","vijay", " khargone",99999);
	}
	
}