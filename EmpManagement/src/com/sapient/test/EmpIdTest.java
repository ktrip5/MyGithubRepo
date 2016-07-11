package com.sapient.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.dao.EmpDaoImpl;
import com.sapient.exceptions.NotFoundException;
import com.sapient.vo.Emp;

public class EmpIdTest {

	private Emp e1;
	private static EmpDaoImpl dao;
	private static SimpleDateFormat sdf;

	@BeforeClass
	public static void beforeClass() {
		dao = new EmpDaoImpl();
		sdf = new SimpleDateFormat("dd-MMM-yyyy");

	}

	@AfterClass
	public static void afterClass() {
		dao = null;
	}

	@Before
	public void setUp() throws ParseException {
		e1 = new Emp(1001, "kartik", 38333, "developer", sdf.parse("13-JUN-2016"));
		// test case fail here coz we have override the equals method which is
		// not available in db
		// e1 = new Emp(1001, "mohan", 38333, "developer",
		// sdf.parse("13-JUN-2016"));

	}

	// assertEquals works over the reference type but here as we overridden the
	// equals method in Emp.java it is working over the value of object
	@Test
	public void viewbyIdtest1() throws NotFoundException {
		Emp actual = dao.viewEmployee(1001);
		assertEquals(e1, actual);
		// assertSame(e1,actual);

	}

	@Test
	public void viewbyIdtest2() throws NotFoundException {

		Emp actual = dao.viewEmployee(1005);
		assertNotNull(actual);

	}

	@Test(expected = NotFoundException.class)
	public void viewbyIdtest3() throws NotFoundException {

		Emp actual = dao.viewEmployee(2006);

	}

}
