package com.UKG;

public class Test {

	private static Test singleton=new Test();	
	
	private Test(){}
	public static Test getInstance() {
		return singleton;	
	}

}
