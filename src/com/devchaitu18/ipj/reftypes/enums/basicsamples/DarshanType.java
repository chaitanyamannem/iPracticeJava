/**
 * 
 */
package com.devchaitu18.ipj.reftypes.enums.basicsamples;

/**
 * A simple enum that shows different facets of an enum.
 * 
 * @author devchaitu18
 * 
 */
public enum DarshanType {

	/** ----------Enum constants or values ---------- **/
	/*
	 * These constants are implicitly public static final equivalent to public
	 * static final Side FREE;
	 */
	VVIP_GRANT_REJECT("Granted", "Rejected"), VIP_ACCEPT_DECLINE("Acceped",
			"Declined"), GENERAL, FREE;

	/**
	 * Note: Before declaring any class members (or initialization blocks) an
	 * enum must first declare all of its enum constants
	 */

	/** -------Normal constants------------ **/
	// Every pligrim gets free quota plus his type quota of laddus(other than
	// DarshanType.Free)
	private static final int LADDUS_FREE = 2;
	private static final int LADDUS_GENERAL = 5;
	private static final int LADDUS_VIP = 10;
	private static final int LADDUS_VVIP = 15;

	/** ------fields---------------------- **/
	String positiveResponse = null;
	String negativeResponse = null;

	/** ---------Constructors------------ **/

	DarshanType() {

	}

	DarshanType(String positiveResponse, String negativeResponse) {
		this.positiveResponse = positiveResponse;
		this.negativeResponse = negativeResponse;

	}

	public void welcomeMessage() {

	}

}
