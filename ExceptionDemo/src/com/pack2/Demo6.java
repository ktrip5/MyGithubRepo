package com.pack2;

//rethrowing an exception
public class Demo6 {

	public static void main(String[] args) {
		try {
			String result = approveLoan(25, 450000);
			System.out.println(result);
		} catch (AgeException | IncomeException e) {
			System.out.println(e.getMessage());
		}

	}

	public static String approveLoan(int age, double income) throws AgeException, IncomeException {

		String res = "loan approved";
		try {
			if (age < 20 || age > 40)

				throw new AgeException("age must be bw 20 and 40");

			if (income < 400000)
				throw new IncomeException("income must be min 4 lakhs");
		} catch (Exception e) {
			// rethrowing exception
			throw e;
			// System.out.println(e.getMessage());
		}
		return res;

	}

}
