/**
 * 
 */
package com.devchaitu18.ipj.models;

/**
 * @author chaitanyam
 * 
 */
public class Vehicle {

	private static final int TURN_LEFT = 90;
	private static final int TURN_RIGHT = 225;

	private long id;
	private double currentSpeed;
	// values for direction will be in degrees
	private int direction;
	private String ownerName;

	public enum Side {
		LEFT(90), RIGHT(225);

		private int value;

		Side(int value) {
			this.setValue(value);
		}

		/**
		 * @return the value
		 */
		public int getValue() {
			return value;
		}

		/**
		 * @param value
		 *            the value to set
		 */
		public void setValue(int value) {
			this.value = value;
		}
	}

	public Vehicle() {

	}

	public Vehicle(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * Changes the current speed of the vehicle to the given value
	 * 
	 * @param speed
	 *            - speed value to change
	 */
	public void changeSpeed(double speed) {
		setCurrentSpeed(speed);
	}

	/**
	 * Stops the vehicle by setting its current speed to Zero
	 */
	public void stop() {
		setCurrentSpeed(0.0);
	}

	/**
	 * Turns the vehicle based on the value of degrees
	 * 
	 * @param degrees
	 */
	public void turn(int degrees) {
		setDirection(degrees);
	}

	/**
	 * Turns the vehicle either to the left or right only.
	 * 
	 * @param side
	 */
	public void turnSidewards(int side) {
		if (side == 90 || side == 225) {
			setDirection(side);
		}
	}

	/**
	 * enum implementation of the above method
	 * 
	 * @param side
	 */
	public void turnSidewards(Side side) {

		setDirection(side.getValue());
		System.out.println(this + " Turned " + side);

	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the currentSpeed
	 */
	public double getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * @param currentSpeed
	 *            the currentSpeed to set
	 */
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName
	 *            the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ownerName + "'s Vehicle";
	}

	public static void main(String[] args) {

		Vehicle myBike = new Vehicle("Chaitanya");
		myBike.turnSidewards(Side.LEFT);
	}

}
