package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Account2 {
	public static void main(String[] args) throws Exception {
		
		Automobile A = new Automobile();
		
		Person P = new Person();
		
		Account S = new Account();
		
		S.setNumber("991710510003072");
		S.setAccounttype("Saving");
		S.setBalance(5000);
		S.withdrawal(20);
		S.deposit(50);
		S.paybill(100);
		System.out.println(S.getBalance());
		
		A.setColor("blue");
		A.setSpeed(420);
		A.setMake("honda");
		
		
		P.setName("Purva");
		P.setAdd("Indore");
		P.setDob("03/07/2003");
		
		System.out.println(P.getName());
		System.out.println(P.getAdd());
		System.out.println(P.getDob());
		
		System.out.println(A.getColor());
		System.out.println(A.getSpeed());
		System.out.println(A.getMake());
	}

}