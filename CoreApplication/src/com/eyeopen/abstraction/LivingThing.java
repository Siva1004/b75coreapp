package com.eyeopen.abstraction;

public abstract class LivingThing {
	int id;
	String name;
	void display() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
	}
	abstract void walk();
}
