package com.pack2;

public class Demo3 {
	//custom exception

	public static void main(String[] args) {
		try {
			String result = approveLoan(20, 700000);
			System.out.println(result);
		} catch (AgeException | IncomeException e) {

			e.printStackTrace();
		}

	}

	public static String approveLoan(int age, double income) throws AgeException, IncomeException {

		String res = "loan approved";
		if (age < 20 || age > 40)
			// these are checked exception cause we hav extends Exception class
			// in ageexception and incomeexception
			// that's y compiler will force us to throw these exceptions
			// we throws Ageexception and income exception
			throw new AgeException("age must be bw 20 and 40");
		if (income < 400000)
			throw new IncomeException("income must be min 4 lakhs");
		return res;

	}

}
