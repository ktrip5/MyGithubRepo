package com.sapient.beans;

public class Bank implements Offline,Agent {
	
	

	@Override
	public void withdraw() {
		System.out.println("withdraw");
		
	}

	@Override
	public void getBal() {
		System.out.println("getbal");
		
	}

	@Override
	public void clearPDC() {
		System.out.println("clear pdc");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit");
		
	}
	

}
