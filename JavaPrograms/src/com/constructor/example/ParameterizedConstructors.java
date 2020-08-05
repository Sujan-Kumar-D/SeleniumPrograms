package com.constructor.example;

public class ParameterizedConstructors {

	int a;

	ParameterizedConstructors(int value) {
		a = value;
	}

	public static void main(String[] args) {

		DefaultConstructors con = new DefaultConstructors();
		System.out.println(con.a);
		
		ParameterizedConstructors par = new ParameterizedConstructors(200);
		System.out.println(par.a);

	}

}