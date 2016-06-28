package com.sapient.been;

import com.sapient.util.Myutil;

public class Interest {
	public double amount;
	public int  year;
	public float rate;
	
	
	public double calSimpleI(){
		
		return Myutil.roundOffdecimals(amount*year*rate/100);
	}
	public double calCompndI(){
		return  Myutil.roundOffdecimals(amount*Math.pow((1+rate/100.0),year)-amount);
	}

}
