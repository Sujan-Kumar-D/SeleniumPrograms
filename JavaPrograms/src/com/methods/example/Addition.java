package com.methods.example;

public class Addition {
	
	public int add(int a1, int a2) {
		int result = a1+a2;
		return result;
	}
	
	public static int substraction(int b1, int b2) {
		int finalresult = b1-b2;
		return finalresult;
	}
	
	public void print() {
		System.out.println("Void Statement");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition sum = new Addition();
		int results = sum.add(10, 20);
		System.out.println(results);
		int z = substraction(30,20);
		System.out.println(z);
		sum.print();
	}

}
