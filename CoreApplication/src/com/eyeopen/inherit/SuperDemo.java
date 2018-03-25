package com.eyeopen.inherit;


class Test{
	public void display() {
		System.out.println("Base class method.");
	}
}
public class SuperDemo extends Test {
	public void display() {
		super.display();
		System.out.println("Derived class method.");
	}
	public static void main(String[] args) {
		SuperDemo obj = new SuperDemo();
		obj.display();
	}
}
