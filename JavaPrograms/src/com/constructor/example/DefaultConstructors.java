package com.constructor.example;

public class DefaultConstructors {
	
	int a;
	
	DefaultConstructors(){
		a = 100;
	}

	public static void main(String[] args) {
		
		DefaultConstructors con = new DefaultConstructors();
		System.out.println(con.a);

	}

}