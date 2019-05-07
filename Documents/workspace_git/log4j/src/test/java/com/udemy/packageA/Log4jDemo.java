package com.udemy.packageA;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	//Create instance for logger class
	private static Logger log = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
	
	// Log statements
	log.info("Demo test");
	log.error("Not generating the logs");
	log.debug("Debugging");
	log.fatal("Fatal error");
		
	}
	
	

}
