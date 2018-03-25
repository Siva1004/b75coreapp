package com.eyeopen.inherit;

class A{
	A(){
		System.out.println("Super:: Default()");
	}
	A(String city){
		this();
		System.out.println("Base:: City "+city);
	}
}
class B extends A{
	B(String location){
		super("Chennai.");
		System.out.println("Derived1:: Location is "+location);
	}
}
class C extends B{
	C(String name){
		super("Anna Nagar.");
		System.out.println("Derived2:: Name is "+name);
	}
}
public class SuperOfDemo {
	public static void main(String[] args) {
		C obj = new C("Eyeopen");
	}
}
