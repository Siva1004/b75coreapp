package com.eyeopen.abstraction;

public class Train implements IVehicle, IPublicTransport {

	@Override
	public void getNumberOfPeople() {
		System.out.println("Train, allows to 1200 people.");
	}

	@Override
	public void drive() {
		System.out.println("Train is in drive mode.");
	}

	@Override
	public void turnLeft() {
		System.out.println("Train is in turnleft mode.");
	}

	@Override
	public void brake() {
		System.out.println("Train is in brake mode.");
	}
}
