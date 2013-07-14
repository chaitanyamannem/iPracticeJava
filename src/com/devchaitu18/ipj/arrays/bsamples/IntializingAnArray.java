package com.devchaitu18.ipj.arrays.bsamples;

import com.devchaitu18.ipj.arrays.models.Apple;

/**
 * This is a basic sample class that demonstrates the intialization of an array.
 * 
 * @author devchaitu18
 * 
 */
public class IntializingAnArray {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * When you declare an array you can specify the initial values of the
		 * elements. This is done by providing a comma−delimited list between
		 * braces [{ }] after an equal sign at the declaration point. The length
		 * is automatically set based on the number of elements in the
		 * comma-delimited list.
		 */

		// Intializing a primitive type array
		int intArray[] = { 1, 2, 3 };
		//This is also valid. The extra comma here is for the benefit of code genrators.
		double doubleArray[] = {0.1,0.2,0.3,};

		// Intialzing a reference type array
		Apple[] italianApples = {new Apple(),new Apple(), new Apple()};
		

	}
}
