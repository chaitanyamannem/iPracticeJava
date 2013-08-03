package com.devchaitu18.ipj.arrays.general;

import java.util.Calendar;
import java.util.Date;

/**
 * just used for temoporary purposes
 * @author devchaitu18
 *
 */
public class TrashMe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boolean boo = false;
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

	}
	
	public static void isValid(boolean value){
		System.out.println(value);
	}

}
