package com.sapient.been;

import java.util.Scanner;
import com.sapient.been.*;

public class ArmClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opt = null;
		
		do {
			System.out.println("enter the number");
			ArmStrong arm=new ArmStrong();
			arm.num = sc.nextInt();
			System.out.println(arm.findArmstrong());
			System.out.println("prompt y to continue");
			opt = sc.next();
		} while (opt.equals("y"));

	}
}
