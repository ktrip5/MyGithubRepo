package com.sapient.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalcTest.class, RoundTest.class, LoanTest.class })
public class AllTest {

}
