package com.sapient.client;

import com.sapient.beans.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		NokiaLumia obj=new NokiaLumia();
		obj.captureVideo();
		obj.doConverse();
		
		//sub class methods override the super class methods 
		// concept of overriding
		obj.sendSms();
		obj.dopreviousConverse();

	}

}
