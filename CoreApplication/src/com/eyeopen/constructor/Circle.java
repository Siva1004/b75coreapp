package com.eyeopen.constructor;

public class Circle {
	static double result;
	public double calculateArea(double radius) {
		double aoc = 3.14*radius*radius;
		return aoc;
	}
	public static void main(String[] args) {
		Circle obj = new Circle();
		result = obj.calculateArea(12.5);
		System.out.println("Area of Circle: "+result);
	}
}
