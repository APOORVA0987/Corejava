package com.firstjava;

public class TestMethod2 {
	int a = 30;
	int b = 20;
	
	public static void main(String[] args) {
		TestMethod t =   new TestMethod();
		t.add(30,20);
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}

}
