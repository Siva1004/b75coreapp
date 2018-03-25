package com.eyeopen.abstraction;

abstract class Shape{
	String color;
	void getColor(String color) {
		this.color = color;
		System.out.println(color);
	}
	abstract double calculateArea();
}
class Circle extends Shape{
	@Override
	double calculateArea() {
		double radius = 5.0;
		getColor("Circle:: green");
		return 3.14*radius*radius;
	}	
}
class Square extends Shape{
	@Override
	double calculateArea() {
		double area = 4.0;
		getColor("Square:: red");
		return area*area;
	}
}
public class AbstractDemo {
	public static void main(String[] args) {
		Shape obj = new Circle();
		double aoc = obj.calculateArea();
		System.out.println("Area of Circle : "+aoc);
		
		obj = new Square();
		double aos = obj.calculateArea();
		System.out.println("Area of Square : "+aos);
	}
}
