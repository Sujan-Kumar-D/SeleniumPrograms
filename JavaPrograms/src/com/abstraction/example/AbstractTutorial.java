package com.abstraction.example;

abstract class dog{
	String breed;
	
	public void bark() {
		System.out.println("Bark!");
	}
	
	public abstract void check();
}

class cat extends dog{
	
	public void check() {
		System.out.println("Bite!");
	}
	
}

public class AbstractTutorial {

	public static void main(String[] args) {
		
		cat c = new cat();
		c.bark();
		c.check();

	}

}
