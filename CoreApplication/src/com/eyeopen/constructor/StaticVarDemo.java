package com.eyeopen.constructor;

public class StaticVarDemo {
	int x = 3;
	static int y = 5;
	public void display() {
		x++;
		y+=7;
		System.out.println("x value is "+x+" y value is "+y);
	}
	public static void main(String[] args) {
		StaticVarDemo s1 = new StaticVarDemo();
		s1.display();	
		StaticVarDemo s2 = new StaticVarDemo();
		s2.display();
		StaticVarDemo s3 = new StaticVarDemo();
		s3.display();
	}
}
// x value is 4 y value is 12
// x value is 4 y value is 19
// x value is 4 y value is 26
