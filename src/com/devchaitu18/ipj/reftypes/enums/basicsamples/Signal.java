/**
 * 
 */
package com.devchaitu18.ipj.reftypes.enums.basicsamples;

import java.awt.Color;

/**
 * simple enum example
 * 
 * @author devchaitu18
 * 
 */
public enum Signal {

	RED(Color.RED), YELLOW(Color.YELLOW), GREEN(Color.GREEN);

	/** -------Static intialization Block---------- **/
	static {
		int delay = 100;
	}

	// Non-constant static field
	private static int delayTime;

	// fields
	Color color = null;

	Signal(Color color) {
		this.color = color;
		// You Cannot refer to the static enum field Signal.delayTime within an
		// initializer
		// delayTime = 100;
		// The work around for above problem is to do it in static intialization
		// block.
	}

}
