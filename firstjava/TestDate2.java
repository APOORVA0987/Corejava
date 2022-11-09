package in.com.rays.firstjava;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate2{

	public static void main(String[] args) throws ParseException {
	
		Date Today = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
Date dob = sdf.parse("03/07/2003");
int a = Today.getDate();
		int b = dob.getDate();
		int c = a-b;
		System.out.println("Age"+ c);
		
	
	}

}
