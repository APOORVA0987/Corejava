package in.com.rays.firstjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	
	public static void main(String[] args) throws ParseException {
		
	Date d = new Date();
	
	System.out.println(d);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	String nd = sdf.format(d);
	System.out.println(nd);
	
	String s = ("22/03/2009");
	Date d1 = sdf.parse(s);
	System.out.println(d1);
	
	
	
	}
	
	

}
