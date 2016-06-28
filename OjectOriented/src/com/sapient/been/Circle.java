package com.sapient.been;

public class Circle {
	public double radius;
	public double result;
	public double calArea(){
		result=Math.PI*this.radius*this.radius;
		return result;
	}
	public double calPerimeter(){
	result=2*Math.PI*this.radius;	
	return result;
	}
}
