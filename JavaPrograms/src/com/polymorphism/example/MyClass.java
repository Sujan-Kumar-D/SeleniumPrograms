package com.polymorphism.example;

//Static Polymorphism

public class MyClass {
	
	void info() {
		System.out.println("First Method");
	}
	
	void info(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		MyClass my = new MyClass();
		my.info();
		my.info("Overloaded Method");

	}

}
