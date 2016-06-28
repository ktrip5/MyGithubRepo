package com.sapient.beans;

public class Camera extends Product {
	private String lens;

	public Camera(int id, String pname, double price, String lens) {
		super(id, pname, price);
		this.lens = lens;
	}

	@Override
	public String isExpensive() {
		if (getPrice() > 20000)
			return "camera is costly";
		else
			return "camera has average price";

	}

	@Override
	public String display() {
	//super.display() will get all three fields of parent class
		return super.display()+" " + lens;
	}
	
	

}
