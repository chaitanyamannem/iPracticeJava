package com.devchaitu18.ipj.controlflow.breakstmt.mistakes;

/**
 * Objective: To parse a String of the form "11&22&33&44&&55xyz&66&77&88&99"
 * into list of numbers and display them. Mistake: Try to find the mistake in
 * this program correct it.
 * Solution: Add a break statement at line 26
 * Description: If we don't give the break here the program continues to evaluate
 * the string which is unecessary waste of execution time.
 * @author devchaitu18
 * 
 */
public class BreakStatementMistake1Resolved {

	public static void main(String[] args) {
		String stringToParse = "11&22&33&44&55&xyz&66&77&88&99";
		String ampersandDelimiter = "[&]";
		String[] numbersAsStringList = stringToParse.split(ampersandDelimiter);

		for (int i = 0; i < numbersAsStringList.length; i++) {
			try {
				Integer number = Integer.parseInt(numbersAsStringList[i]);
				System.out.println(number);
			} catch (NumberFormatException nfe) {
				System.out.println("Unable to parse the list");
				break;
			}

		}

	}

}
