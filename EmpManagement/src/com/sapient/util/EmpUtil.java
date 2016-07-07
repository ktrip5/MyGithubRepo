package com.sapient.util;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.sapient.dao.EmpDaoImpl;
import com.sapient.dao.Idao;

/**
 * This contains utility methods to view resourcebundleand and logger
 * 
 * @author ktrip5
 *
 */

public class EmpUtil {

	private static ResourceBundle rbumdle;

	private static Logger logger;

	/**
	 * one logger is enough for every class and so for resource bundle
	 */
	static {
		rbumdle = ResourceBundle.getBundle("sap");

		logger = Logger.getRootLogger();
	}

	/**
	 * return resource bundle
	 * 
	 * @return
	 */
	public static ResourceBundle getBundle() {
		return rbumdle;
	}

	/**
	 * view log4j logger
	 * 
	 * @return
	 */
	public static Logger viewLogger() {
		return logger;

	}

	/**
	 * return empdaoimpl instance in idao reference
	 * 
	 * @return
	 */

	public static Idao getDaoInstance() {
		Idao dao = new EmpDaoImpl();
		return dao;

	}
}
