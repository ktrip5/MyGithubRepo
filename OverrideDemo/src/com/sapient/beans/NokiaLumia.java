package com.sapient.beans;

public class NokiaLumia extends Nokia1100 {
	
	public void doConverse()
	{
		System.out.println("3g converse");
	}
	public void captureVideo()
	{
		System.out.println("capture video");
	}
// if we want access the overridden method of super class then we can access that overridden method by this way
	public void dopreviousConverse()
	{
		super.doConverse();
	}
}
