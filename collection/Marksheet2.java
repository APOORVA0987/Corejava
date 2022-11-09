package in.com.rays.collection;

import java.util.Comparator;
import java.util.List;

import jdk.dynalink.linker.ConversionComparator;

public class Marksheet2 implements Comparator <Marksheet2> {
	
	
	private String rollnumber;
	private String Fname;
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
		return Fname;
	}
	public void setFname(String fname) {
		this.Fname = fname;
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
	public int compare(Marksheet2 o1, Marksheet2 o2) {
		
		return o1.getFname().compareTo(o2.getFname());
	}
	public static List sortByFname() {
		
		return null;
	}
	
	

}
