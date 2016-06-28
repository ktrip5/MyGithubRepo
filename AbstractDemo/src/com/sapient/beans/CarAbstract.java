package com.sapient.beans;

public class CarAbstract extends AbstractVehicle {

	public CarAbstract(int vehId, String vehName) {
		super(vehId, vehName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  void drive() {
		System.out.println("car drive");
		
	}
	
	

}
