package in.com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import in.com.rays.exception.Account7;

public class TestApa {
	public static void main(String[] args) throws Account7{
		
		Automobile A = new Automobile();
		
		Person P = new Person();
		
		Account S = new Account();
		
		S.setNumber("991710510003072");
		S.setAccounttype("Saving");
		S.setBalance(5000);
		
		S.deposit(50);
		S.paybill(100);
		System.out.println(S.getBalance());

		S.withdrawal(4000);
		
		System.out.println(S.getBalance());
		S.withdrawal(900);
	
	}

}