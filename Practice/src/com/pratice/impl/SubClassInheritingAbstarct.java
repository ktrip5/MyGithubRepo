package com.pratice.impl;

public abstract class SubClassInheritingAbstarct extends AbstractClassExplanation {

	public SubClassInheritingAbstarct(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}





	public String str = "Tripathi";

	public abstract void printMethodSubClass();
	
	



	public void writeMethodSubClass() {
		System.out.println("Inside write method of subclass or abstarct class");
	}

}
