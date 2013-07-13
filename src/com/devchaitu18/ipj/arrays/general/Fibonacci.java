package com.devchaitu18.ipj.arrays.general;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is class is created for its use in WhyArraysUseCase.java
 * 
 * @author devchaitu18
 * 
 */
public class Fibonacci {
	private static final Logger logger = Logger.getLogger(Fibonacci.class
			.getName());

	// Print out the Fibonacci sequence for values < 50

	public static void main(String[] args) {

		int previousTerm = 1;
		int currentTerm = 1;

		logger.log(Level.INFO, "" + previousTerm);

		while (currentTerm < 50) {
			logger.log(Level.INFO, "" + currentTerm);
			// next term is always the sum of previous and current terms
			currentTerm = previousTerm + currentTerm;
			/*
			 * The new previous term is difference of new current term and
			 * present previous term
			 */
			previousTerm = currentTerm - previousTerm;
		}

	}

}
