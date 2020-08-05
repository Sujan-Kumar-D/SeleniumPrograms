package com.learning.java;

public class Variables {

	public static void staticTest() {
		int a = 10;
		System.out.println(a);
	}
	
	public void nonstaticTest() {
		int a = 11;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		final int a = 9;
		staticTest();
		System.out.println(a);
		Variables var = new Variables();
		var.nonstaticTest();
	}

}
