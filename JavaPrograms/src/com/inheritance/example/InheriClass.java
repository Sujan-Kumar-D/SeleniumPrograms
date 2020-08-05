package com.inheritance.example;

public class InheriClass extends Programmer{
	
	int a = 10;
	int b = a+bonus;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheriClass inheri = new InheriClass();
		int c = inheri.a+inheri.b;
		System.out.println(c);

	}

}
