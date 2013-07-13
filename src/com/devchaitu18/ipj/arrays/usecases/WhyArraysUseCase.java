package com.devchaitu18.ipj.arrays.usecases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Modify com.devchaitu18.ipj.arrays.general.Fibonacci to store the sequence
 * into an array and print the list of values at the end. Also this is a
 * solution to Exercise1.9 in the JAVA PROGRAMMING LANGUAGE by James Gosling.
 * 
 * @author devchaitu18
 * 
 */
public class WhyArraysUseCase {
	private static final Logger logger = Logger
			.getLogger(WhyArraysUseCase.class.getName());

	/*----Problem Description-----*/
	/*
	 * If you observe the com.devchaitu18.ipj.arrays.general.Fibonacci class you
	 * will find that we are discarding the values as soon as we print them.
	 * This is fine if we just want to print them. What if we want to use them
	 * somewhere else also like a program drawing a spiral can use this numbers
	 * to draw the spiral.
	 */
	public static void main(String[] args) {
		int LIMIT = 1000;
		// Print the fibonacci sequence till 100
		int[] fiboSequence = getAFibonacciSequence(LIMIT, 20);
		for (int i = 0; i < fiboSequence.length; i++) {
			if (fiboSequence[i] > LIMIT) {
				break;
			}
			logger.log(Level.INFO, "Term" + i + ":" + fiboSequence[i]);

		}

	}

	/**
	 * Gives a fibonacci sequence array till the specified limit. If the
	 * guessTheNumOfTerms is less than 3 then a default value of 50 is taken.
	 * 
	 * @param limit
	 *            The nth value of the Fibonacci sequence
	 * @param guessTheNumOfTerms
	 *            approximate number of terms in the sequence. This determines
	 *            the size of array.
	 * @return
	 */
	public static int[] getAFibonacciSequence(int limit, int guessTheNumOfTerms) {
		if (guessTheNumOfTerms < 3) {
			guessTheNumOfTerms = 50;
		}
		int[] fibonacciSequence = new int[guessTheNumOfTerms];
		fibonacciSequence[0] = 0;
		fibonacciSequence[1] = 1;
		int previousTerm = fibonacciSequence[0];
		int currentTerm = fibonacciSequence[1];

		for (int i = 2; i <= guessTheNumOfTerms; i++) {

			// next term is always the sum of previous and current terms
			currentTerm = previousTerm + currentTerm;
			if(currentTerm > limit){
				break;
			}
			fibonacciSequence[i] = currentTerm;
			/*
			 * The new previous term is difference of new current term and
			 * present previous term
			 */
			previousTerm = currentTerm - previousTerm;

		}
		return fibonacciSequence;

	}
}
