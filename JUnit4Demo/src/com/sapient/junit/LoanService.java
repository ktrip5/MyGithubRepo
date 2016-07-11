package com.sapient.junit;

public class LoanService {

	public boolean approveLoan(int age, double income) throws AgeException, IncomeException {
		if (age < 20 || age > 40)
			throw new AgeException("age is more than the limit of loan holder");

		if (income < 400000)
			throw new IncomeException("income should be grater than 400000");
		return true;
	}

}
