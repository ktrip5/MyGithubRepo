package com.sapient.beans;

public class MyUtil {
	private static Bank bank = new Bank();

	public static Atm getAtm() {
		Atm atm = bank;
		return atm;

	}

	public static Offline getOffline() {
		Offline off = bank;
		return off;
	}

	public static Agent getAgent() {
		Agent agent = bank;
		return agent;
	}

}
/*imp note=> Bank bank=new Bank();
here we can access all the methods  defined in BAnk class
but when we define it like 
Atm atm=new Bank();
then we can only access the methods in atm interface.*/