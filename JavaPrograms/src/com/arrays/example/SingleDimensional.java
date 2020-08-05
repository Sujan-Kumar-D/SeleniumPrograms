package com.arrays.example;

public class SingleDimensional {

	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		System.out.println(a[0]);
		System.out.println(a[4]);
		System.out.println(a.length);
		
		int []b = new int [] {6,7,8,9,10};
		System.out.println(b.length);
		System.out.println(b[3]);
		
		for(int x:a) {
			System.out.println(x);
		}
	}

}
