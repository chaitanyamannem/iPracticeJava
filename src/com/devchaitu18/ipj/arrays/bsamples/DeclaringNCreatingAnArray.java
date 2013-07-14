package com.devchaitu18.ipj.arrays.bsamples;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.devchaitu18.ipj.arrays.models.Apple;

/**
 * This is a basic sample class that demonstrates how to declare and create an
 * array.
 * 
 * @author devchaitu18
 * 
 */
public class DeclaringNCreatingAnArray {

	private static final Logger logger = Logger
			.getLogger(DeclaringNCreatingAnArray.class.getName());

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
		 * Type 1 -- This tells that simlaApples and washingtonApples are of
		 * type Apple. Here both simlaApples and washingtonApples are arrays.
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

		/*-----------Creating an array------------------*/
		/*
		 * Step 1 - use new operator  Step 2 - specify the type name  step 3 - specify the length.
		 * Note: Java automatically initializes all of the values in an array when it is created.
		 */

		// creating a primitive type array
		intArray = new int[10];

		// creating a reference type array
		kashmirApples = new Apple[10];

		/*-----Note: Arrays of size zero are valid------*/
		doubleArray = new double[0];
		logger.log(Level.INFO,
				"doubleArray reference: " + doubleArray.hashCode());
		logger.log(Level.INFO, "Length of doubleArray: " + doubleArray.length);
		
		/*----An array can be reinstantiated or recreated with new operator--------*/
		//Address of intArray before recreation
		logger.log(Level.INFO,"Address of intArray before recreation: " + intArray);
		intArray = new int[20];
		logger.log(Level.INFO,"Address of intArray after recreation: " + intArray);
		/*--Note: But you cannot change its type once declared.--*/
		//intArray = new String[6]; This is not possible

	}

	/**
	 * Using a method to create a primitive type array
	 * 
	 * @param size
	 *            - Number of elements in the array
	 * @return
	 */
	public static double[] createDoubleArrayOfSize(int size) {
		/*
		 * This demonstrates that the length can also be specified as an
		 * expression
		 */
		return new double[(size - 1 + 1)];
	}
}
