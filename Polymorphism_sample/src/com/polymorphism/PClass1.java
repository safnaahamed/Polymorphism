package com.polymorphism;

public class PClass1 {
	int a, b, c;

	public PClass1() {

		System.out.println("Constructor in parent class");
	}

	public void firstMethod() {
		System.out.println("I am a mother");

	}

	public void add() {

		a = 10;
		b = 20;
		c = a + b;
		System.out.println("The sum is = " + c);
	}

}
