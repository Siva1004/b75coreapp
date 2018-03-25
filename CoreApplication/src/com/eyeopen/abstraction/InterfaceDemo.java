package com.eyeopen.abstraction;

public class InterfaceDemo {
	public static void main(String[] args) {
		IVehicle iobj = new Car();
		iobj.drive();
		iobj.turnLeft();
		iobj.brake();
		IAdvancedVechicle iaobj = new Car();
		iaobj.accelerate();
		new Car().checkMotor();
		
		iobj = new Train();
		iobj.drive();
		iobj.turnLeft();
		iobj.brake();
		IPublicTransport ipublic = new Train();
		ipublic.getNumberOfPeople();		
	}
}
