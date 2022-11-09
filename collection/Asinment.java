package in.com.rays.collection;

import java.util.Comparator;

public class Asinment implements Comparator<Asinment> {
	
	private String Fname;
	private String Lname;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	@Override
	public int compare(Asinment o1, Asinment o2) {
		
		int i=  o1.getFname().compareTo(o2.Fname);
		if(i==1) {
			return 1;
		}
		else if(i==0) {
			return o1.getLname().compareTo(o2.Lname);
		}
		else {
			return -1;
			}
		
	}
	
	

}
