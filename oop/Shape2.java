package com.rays.oop;

public class Shape2 {
	public static void main(String[] args) {
		
		Shape S = new Shape("blue",5);
		
		String a = S.getColor(); 
		int b = S.getBorderwidth();
		System.out.println(a);
		System.out.println(b);
	}
}