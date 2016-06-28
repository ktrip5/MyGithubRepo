package com.sapient.been;

public class ArmStrong {

	public int num;

	public String findArmstrong() {
		String res = "not armstrong";
		int len = findLength();
		int quot = num;
		int rem = 0;
		int sum = 0;
		while (quot > 0) {
			rem = quot % 10;
			sum = (int) (sum + Math.pow(rem, len));
			quot = quot / 10;
		}
		if (sum == num)
			return "armstrong";
		return res;
	}

	public int findLength() {
		int count = 0;
		int quot = num;
		while (quot > 0) {
			quot = quot / 10;
			count++;
		}
		return count;
	}
}
