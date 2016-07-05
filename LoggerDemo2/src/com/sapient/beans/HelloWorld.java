package com.sapient.beans;

import org.apache.log4j.Logger;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("helloWorld");
		Logger log = Logger.getLogger("sapient");
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
		log.trace("trace1");
		log.debug("debug1");
		log.info("info1");
		log.warn("warn1");
		log.error("error1");
		log.fatal("fatal1");
	}

}
