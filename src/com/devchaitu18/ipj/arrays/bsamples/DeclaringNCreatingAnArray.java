package com.devchaitu18.ipj.arrays.bsamples;

import com.devchaitu18.ipj.arrays.models.Apple;

/**
 * This is a basic sample class that demonstrates how to declare and create an
 * array.
 * 
 * @author devchaitu18
 * 
 */
public class DeclaringNCreatingAnArray {

	/**
	 * The supressWarnings("unused") is used for better readbility.
	 * 
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/*-----------Declaring an array------------------*/
		/* Just add brackets([ ]) to the type. */

		// Declaring Arrays of Primitive type
		int[] intArray;
		double[] doubleArray;

		// Declaring an Array of reference type
		Apple[] applesArray;

		/*
		 * Different ways to declare an array. This really matters when you are
		 * declaring multiple variables in a single declaration.
		 */

		/*
		 * Type 1 -- This tells that simlaApples are of type Apple. Here both
		 * simlaApples and washingtonApples are arrays.
		 */
		Apple[] simlaApples, washingtonApples;

		/*
		 * Type 2 -- This tells that kashmirApples is an array and delhiApple is
		 * just an Apple but not an array.
		 */
		Apple []kashmirApples, delhiApple;

		/*
		 * Type 3 -- This type is same as Type 2, but just the position of
		 * Brackets is changed.
		 */
		Apple californiaApples[], amalapuramApple;

	}

}
