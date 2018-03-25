package com.eyeopen.abstraction;
public class Circle1 implements IShape {
	private double radius = 5.2;
	@Override
	public void calculateArea() {
		double aoc = pi*radius*radius;
		System.out.println("Area of Circle :: "+aoc);
	}
	@Override
	public void calculateVolume() {
		double vol = (4/3)*pi*radius*radius*radius;
		System.out.println("Volume of Circle :: "+vol);
	}	
	public void printData() {
		System.out.println("This is own method in Circle class.");
	}
	public static void main(String[] args) {
		IShape obj = new Circle1();
		obj.calculateArea();
		obj.calculateVolume();
		new Circle1().printData();		
	}
}
