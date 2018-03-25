package com.eyeopen.abstraction;

public class Car extends MotorizedVehicle implements IAdvancedVechicle {

	@Override
	public void drive() {
		System.out.println("The car is in drive mode.");
	}

	@Override
	public void turnLeft() {
		System.out.println("The car is in turnleft mode.");
	}

	@Override
	public void brake() {
		System.out.println("The car is in brake mode.");
	}

	@Override
	public void accelerate() {
		System.out.println("The car is in accelarate mode.");		
	}

}
