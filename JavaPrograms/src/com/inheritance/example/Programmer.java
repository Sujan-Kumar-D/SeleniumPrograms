package com.inheritance.example;

class Employee{
	int Salary = 10000;
}

public class Programmer {
	int bonus = 1000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		System.out.println(emp.Salary);
		Programmer pmr = new Programmer();
		System.out.println(pmr.bonus);
	}

}
