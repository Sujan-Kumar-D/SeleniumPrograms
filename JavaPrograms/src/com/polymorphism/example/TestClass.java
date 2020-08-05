package com.polymorphism.example;

class exercise1{
	void test1() {
		System.out.println("First test method");
	}
	void test2() {
		System.out.println("First test methods");
	}
}

class exercise2 extends exercise1{
	void test1() {
		System.out.println("Second test method");
	}
}

public class TestClass {

	public static void main(String[] args) {
		exercise1 exr = new exercise1();
		exr.test1();
		exercise2 exrs = new exercise2();
		exrs.test1();

	}

}
