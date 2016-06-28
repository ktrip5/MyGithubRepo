package com.sapient.arraydemo;

public class ArrayDemo3 {

	public static void main(String[] args) {
		String [] arr ={"kartik","tripathi","tinkal","tripathi"};
		String [] arr2=new String[arr.length];
		//System.arraycopy(arr, srcPos, dest, destPos, length);
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		for(String str : arr2)
			System.out.println(str);
	}

}
