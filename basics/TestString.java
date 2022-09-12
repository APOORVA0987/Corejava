package com.rays.basics;

public class TestString {

	public static void main(String[] args) {
		String S="Vijay Dinanath Chauhan";
		//System.out.println(S.length());
		//System.out.println(S.charAt(6));

		//System.out.println( S.indexOf("Dina"));
		for(int i=S.length()-1;i>=0;i--)
		{
			char c=S.charAt(i);
			
			
			System.out.print(c);
		}
	
	
	
}}

