package com.devchaitu18.ipj.arrays.msamples;

/**
 * Sample practice for array creation,declaration and accessing a primitive
 * array.
 * 
 * @author devchaitu18
 * 
 */
public class CreateDeclareAccessArray {

	public static void main(String[] args) {
		// Declaring and creating a primitive character array
		char[] charArray = new char[10];
		// Intializing the array
		charArray[0] = 'c';
		charArray[1] = 'h';
		charArray[2] = 'a';
		charArray[3] = 'i';
		charArray[4] = 't';
		charArray[5] = 'a';
		charArray[6] = 'n';
		charArray[7] = 'y';
		charArray[8] = 'a';
		charArray[9] = '.';

		// Iterating the array normal way
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		// Iterating the array using foreach loop
		for (char c : charArray) {
			System.out.print(c);
		}

	}

}
