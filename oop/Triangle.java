package com.rays.oop;

public class Triangle extends Shape {
	
	private int  base;
	private  int hight ;
	
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int a,int b) {
		base=a;
		hight=b;
	}
	public int getBase() {
		return base;
	}
	
		
	
	public int getHight() {
		return hight;
	}
public	double area() {
	return( base*hight)/2;
} 
	
		
	}
	
	


