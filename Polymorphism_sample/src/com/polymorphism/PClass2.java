package com.polymorphism;

public class PClass2 extends PClass1 {

	public PClass2() {
		super();
		System.out.println("Constructor in child class");
	}

	public void firstMethod() {
		System.out.println("I am a full time employee");
		super.firstMethod();
		super.add();
	}

	public static void main(String[] args) {
		PClass2 p2 = new PClass2();
		p2.firstMethod();
		//p2.add();

	}

}
