package com.string.example;

public class StringExample {
	
	public static void main(String[] args) {
		
		String example1 = "Sujankumar";
		String example2 = "Sujankumbr";
		int a = 10;
		String example = "Heldo";
		String replace = example.replace('d', 'l');
		String s = String.valueOf(a);
		System.out.println(example1.length());
		System.out.println(example1.substring(5));
		System.out.println(example1.compareTo(example2));
		System.out.println(example1.equalsIgnoreCase(example2));
		System.out.println(s);
		System.out.println(replace);
		
	}

}
