package com.devchaitu18.ipj.arrays.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates when a NegativeArraySizeException will be thrown.
 * 
 * @author devchaitu18
 * 
 */
public class NegativeArraySize {

	private static final Logger logger = Logger
			.getLogger(NegativeArraySize.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// case 1
		@SuppressWarnings("unused")
		int negativeArray[] = new int[-10];
		logger.log(Level.INFO, "Will this program execute succesfully?");

		/*----Exception Message -----*/
		/*
		 * Exception in thread "main" java.lang.NegativeArraySizeException at
		 * com.devchaitu18.ipj.arrays.exceptions.NegativeArraySize.main(
		 * NegativeArraySize.java:24)
		 */

	}

}
