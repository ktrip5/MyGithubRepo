package com.sapient.client;

import com.sapient.beans.Camera;
import com.sapient.beans.Computer;
import com.sapient.beans.Product;

public class ProductClient {

	public static void main(String[] args) {

		Product[] pr = new Product[4];
		pr[0] = new Computer(1001, "Dell", 50000, "pentium 5");
		pr[1] = new Computer(1002, "Dell", 35000, "i7");
		pr[2] = new Camera(1003, "nikon", 30000, "40ppi");
		pr[3] = new Camera(1004, "canon", 15000, "25ppi");
		for (Product p : pr)
			System.out.println(p.display() + " "+ p.isExpensive() );
	}

}
