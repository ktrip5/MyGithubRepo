package com.sapient.client;

import com.sapient.been.Circle;

public class crClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		c.radius=5.2;
		double area=c.calArea();
		double perim=c.calPerimeter();
		System.err.println("area ="+area);
		System.err.println("perimeter="+perim);
		

	}

}
