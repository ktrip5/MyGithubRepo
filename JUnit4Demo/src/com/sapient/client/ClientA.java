package com.sapient.client;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.sapient.test.LoanTest;

public class ClientA {

	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(LoanTest.class);
		System.out.println(res.getFailureCount());
		List<Failure> fal = res.getFailures();
		for (Failure f : fal) {
			System.out.println(f.toString());
		}

		System.out.println("success " + res.wasSuccessful());
	}

}
