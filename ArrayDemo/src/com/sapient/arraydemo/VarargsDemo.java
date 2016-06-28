package com.sapient.arraydemo;
// var args concept supresses overloading. like one argument can invoke method contain one argument.
public class VarargsDemo {

	public static void main(String[] args) {
		display();
		display(5,2);
		display(10,2,5,6);
		int [] arr={5,2,8};
		display(arr);

	}
public static void display(int ...arr)
{
	System.out.println("var args called");
	for (int val:arr)
		System.out.println(val);
	System.out.println("----------------------");
}

}
