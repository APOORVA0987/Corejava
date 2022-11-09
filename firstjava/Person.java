package in.com.rays.firstjava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person{
	SimpleDateFormat Sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String name = null;
	private Date dob = null;
    private String add = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
		
	
	
    
    
}
