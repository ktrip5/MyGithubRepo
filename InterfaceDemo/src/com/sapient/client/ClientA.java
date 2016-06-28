package com.sapient.client;

import com.sapient.beans.Atm;
import com.sapient.beans.MyUtil;

public class ClientA {

	public static void main(String[] args) {
		Atm atm= MyUtil.getAtm();
		atm.getBal();
		atm.withdraw();

	}

}
