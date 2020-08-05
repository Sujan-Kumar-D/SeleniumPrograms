package com.inheritance.example;

class Checknames{
	int a = 10;
	String b = "Sujan";
	void check() {
		System.out.println("Parent Class Instance Variables"+a+b);
	}
}

public class SuperExample extends Checknames{
	
	void sample() {
		int a = 50;
		String b = "Sujan";
		System.out.println(super.a);
		System.out.println(super.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExample suprex = new SuperExample();
		suprex.sample();
		suprex.check();

	}

}
