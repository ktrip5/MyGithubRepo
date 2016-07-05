package com.sapient.beans;

import org.apache.log4j.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("helloWorld");
		Logger log= Logger.getRootLogger();
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
	}

}
