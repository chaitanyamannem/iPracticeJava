package com.devchaitu18.ipj.controlflow.breakstmt.basicsamples;

/**
 * This example shows the basic usage of break statement without label.
 * 
 * @author devchaitu18
 * 
 */
public class BreakStatementUsageWithoutLabel {

	public static void main(String[] args) {
		/*
		 * case 1 break doesn't break from an innermost if statement it only breaks from
		 * innermost switch while, do, or for statements.
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			if (i == 5) {
				boolean check = true;

				if (check) {
					System.out.println("i = " + i);
					break;
				}
				System.out.println("Outer if loop");
			}

		}
		System.out.println("Continuing after the first for loop.");
		/*
		 * case 2 A break statement with no label attempts to transfer control
		 * to the innermost enclosing switch, while, do, or for statement of the
		 * enclosing method or initializer
		 */
		for (int p = 0; p < 10; p++) {
			System.out.println("Outer for loop p = " + p);
			// innermost(closest) enclosing for loop
			for (int q = 0; q < 10; q++) {
				System.out.println("Innermost for loop q = " + q);
				// inner for loop
				for (int r = 0; r < 10; r++) {
					System.out.println("Inner for loop r = " + r);
					/*
					 * it breaks here every time after printing 3 values and
					 * then continues normally. this statement, which is called
					 * the break target, then immediately completes normally.
					 */
					if (r == 2)
						break;
				}
			}
		}
	}

}
