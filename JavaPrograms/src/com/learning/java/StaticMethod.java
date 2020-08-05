package com.learning.java;

public class StaticMethod {
	
	public void NonStaticTest() {
		System.out.println("Random Text1");
	}
	
	public static void StaticTest() {
		System.out.println("Random Text2");
	}

	public static void main(String[] args) {
		StaticMethod obj = new StaticMethod();
		obj.NonStaticTest();
		System.out.println("Hello World");
		StaticTest();
	}

}
