package com.practice.java8.features;

class Parent {

	int i = 10;

	int pc1;
	int pc2;

	public Parent(int a, int b) {
		this.pc1 = a;
		this.pc2 = b;
	}

	Parent() {
	}

	protected void display() {
		System.out.println("Inside display() of Parent class");
	}

	protected void m2() {
		System.out.println(" Hi Parent ");
	}

}

class Child extends Parent {

	int i = 20;

	@Override
	public void display() {

		System.out.println("Inside display() of child class");
	}

	public void m2() {
		System.out.println(" Hi Child ");
	}

	protected void m1() {
		System.out.println(" Hi Child m1()");
	}

}

public class MethodOverridingDemo {
	public static void main(String args[]) {
		Parent obj = new Child();
		obj.display();
		// obj.m1();
		obj.m2();
		System.out.println(obj.i);

	}

}