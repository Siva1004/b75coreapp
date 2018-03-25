package com.eyeopen.constructor;

class Box{
	int a, b;
	public Box() {
		this("Hari");
		System.out.println("This is Default Constructor.");
	}
	public Box(String name) {
		this(10,20);
		System.out.println("Welcome to Mr./Ms."+ name);
	}
	Box(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("a value is "+a+" b value is "+b);
	}	
}

public class FirstDemo {
	public static void main(String[] args) {
		Box obj1 = new Box();
	}
}






