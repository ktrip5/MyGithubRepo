package com.sapient.beans;

//abstract class may have abstract methods
public abstract class AbstractVehicle {
	private int vehId;
	private String vehName;

	public AbstractVehicle(int vehId, String vehName) {
		super();
		this.vehId = vehId;
		this.vehName = vehName;
	}

	public String display() {
		return vehId + " " + vehName;
	}
	// if method hav open curley braces and close curley braces called as
	// implemented methods;

	// if method have no open and curley braces then it is called as non
	// implemented methods or abstract methods
	public abstract void drive();

}
