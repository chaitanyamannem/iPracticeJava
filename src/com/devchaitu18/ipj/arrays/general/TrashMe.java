package com.devchaitu18.ipj.arrays.general;

import java.util.Calendar;
import java.util.Date;

/**
 * just used for temoporary testing purposes.
 * @author devchaitu18
 *
 */
public class TrashMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boolean boo = false;
		@SuppressWarnings("unused")
		Boolean booch = null;
		isValid(boo);
		//isValid(booch);
		
		//incrementating a date by one day
		Date today = new Date();
		System.out.println(today);
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, 1);
		Date tommorrow = cal.getTime();
		System.out.println(tommorrow);
		
		//Declaring and creating a primitive character array 
		char[] charArray = new charArray[10];
		//Intializing the array 
		charArray[0] = 'c';
		charArray[1] = 'h';
		charArray[2] = 'a';
		charArray[3] = 'i';
		charArray[4] = 't';
		charArray[5] = 'a';
		charArray[6] = "n";
		charArray[7] = "y";
		charArray[8] = "a";
		charArray[9] = ".";
		//Iterating the array
		for(char[] c : charArray){
			System.out.print(c[i]);
		}
		
		
		

	}
	
	public static void isValid(boolean value){
		System.out.println(value);
	}

}
