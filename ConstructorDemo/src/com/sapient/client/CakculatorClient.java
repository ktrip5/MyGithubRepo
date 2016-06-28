package com.sapient.client;

import com.sapient.beans.StdCalculator;

public class CakculatorClient {

	public static void main(String[] args) {
		try {
			StdCalculator cal = new StdCalculator(56.54234);
			System.out.println(cal.round2decimal());
			System.out.println(cal.round2decimal(8));
			System.out.println(cal.convert2Int());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// invoking constructor with arg
		StdCalculator calc1;
		try {
			calc1 = new StdCalculator(100);
			System.out.println(calc1.convert2Hexa());
			System.out.println(calc1.convertTobinary());
			System.out.println(calc1.convert2Octal());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		StdCalculator calc2;
		try {
			calc2 = new StdCalculator(20.87545, 10);
			System.out.println(calc2.doAdd());
			System.out.println(calc2.doMultiply());
			System.out.println(calc2.doSubtraction());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
