package in.com.rays.collection;

public class Marksheet1 implements Comparable  <Marksheet1>{
	
	private String rollnumber;
	private String fname;
	private String lname;
	private int maths;
	private int physics;
	private int chemstry;
	
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemstry() {
		return chemstry;
	}
	public void setChemstry(int chemstry) {
		this.chemstry = chemstry;
	}
	@Override
	public int compareTo(Marksheet1 o) {
		
		return this.rollnumber.compareTo(rollnumber);
	}
	
	
	

}
