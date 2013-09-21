package com.devchaitu18.ipj.controlflow.breakstmt.compiletimeerrors;

/**
 * This example trys to demonstrate the following statement: If no switch,
 * while, do, or for statement in the immediately enclosing method, constructor,
 * or initializer contains the break statement, a compile-time error occurs.
 * 
 * @author devchaitu18
 * 
 */
public class NoImmediateEncloserForBreak {

	public static void main(String[] args) {
		boolean check = true;
		System.out.println("Calling method display");
		display(check);
	}
	
	public static void display(boolean check){
		if(check){
			// break; compile-time errror: break cannot be used outside of a loop or a switch
		}
	}

}
