package com.rays.oop;

public class Testaccount2 {
	
	public static void main(String[] args) {
		
		Testaccount T = new Testaccount("991710510003072","Saving");
		
		String a = T.getNumber();
		String b = T.getAccounttype(); 
		
		System.out.println( T.getNumber());
		System.out.println(T.getAccounttype());
		
	}

}
