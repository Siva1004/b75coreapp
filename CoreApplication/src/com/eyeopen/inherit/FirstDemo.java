package com.eyeopen.inherit;

class Base{
	int a;
	private int b;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
class Derived extends Base{
	int sum;
	void display() {
		System.out.println("a value is "+a+" b value is "+getB());
		sum = a+getB();
		System.out.println("sum of a,  b is "+sum);
	}
}
public class FirstDemo {
	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.a = 10;
		obj.setB(12);
		
	}
}






