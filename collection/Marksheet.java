package in.com.rays.collection;

public class Marksheet {
	
	
	  @Override public String toString() { return "Marksheet [rollnumber=" +
	  rollnumber + ", name=" + name + ", physics=" + physics + ", maths=" + maths +
	  ", chamistry=" + chamistry + ", getRollnumber()=" + getRollnumber() +
	  ", getName()=" + getName() + ", getPhysics()=" + getPhysics() +
	  ", getMaths()=" + getMaths() + ", getChamistry()=" + getChamistry() +
	  ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
	  + super.toString() + "]"; }
	 
	private String rollnumber;
	private String name;
	private  int  physics;
	private int maths ;
	private int chamistry;
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getChamistry() {
		return chamistry;
	}
	public void setChamistry(int chamistry) {
		this.chamistry = chamistry;
	}
	
	
		
	}


