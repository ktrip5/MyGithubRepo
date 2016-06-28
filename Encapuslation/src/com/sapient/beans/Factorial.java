package com.sapient.beans;

public class Factorial {
	private int num;

	public void setNum(int num) throws Exception {
		if (num > 0 && num <= 19)
			this.num = num;
		else
			throw new Exception("number must be in between 0 and 19");
	}

	public long findFact() {
		long fact = 1;
		for (int i = 1; i <= num; i++)
			fact = fact * i;
		return fact;
	}

}
