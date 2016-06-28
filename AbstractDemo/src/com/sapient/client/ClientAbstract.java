package com.sapient.client;

import com.sapient.beans.AbstractVehicle;
import com.sapient.beans.CarAbstract;

public class ClientAbstract {

	public static void main(String[] args) {
		//AbstractVehicle veh= new  AbstractVehicle ();
		// abstract class can not be instantiated.
		
		AbstractVehicle veh= new CarAbstract(1001, " sail");
		System.out.println(veh.display());
		veh.drive();
		
	}

}
