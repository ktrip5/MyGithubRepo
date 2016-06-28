package com.sapient.client;

import com.sapient.beans.Car;

public class CarClient {

	public static void main(String[] args) {
		
		Car car=new Car(1001, "hyundai", 100000);
		car.display();
	}

}
