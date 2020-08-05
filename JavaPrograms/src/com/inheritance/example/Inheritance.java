package com.inheritance.example;

class Add{
	int a = 15;
	int b = 10;
	void add() {
		System.out.println(a+b);
	}
}

class Sub extends Add{
	void sub() {
		System.out.println(a-b);
	}
}

class Mul extends Sub{
	void mul() {
		System.out.println(a*b);
	}
}

class Div extends Mul{
	void div() {
		System.out.println(a/b);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Div d = new Div();
		d.add();
		d.sub();
		d.mul();
		d.div();

	}

}
