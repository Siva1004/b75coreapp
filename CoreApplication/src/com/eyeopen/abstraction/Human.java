package com.eyeopen.abstraction;

public class Human extends LivingThing {
	@Override
	void walk() {
		System.out.println("Human walk with 2 legs.");		
	}
	public static void main(String[] args) {
		Human obj = new Human();
		obj.id = 1205;
		obj.name = "Ragupathy";
		obj.display();
		obj.walk();
	}
}
