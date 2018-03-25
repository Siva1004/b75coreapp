package com.eyeopen.inherit;

class Animal{
	public void whoAmI() {
		System.out.println("I am a generic Animal.");
	}
	//void display();
}
class Cow extends Animal{
	@Override
	public void whoAmI() {
		System.out.println("I am a Cow.");
	}
}
class Dog extends Animal{
	@Override
	public void whoAmI() {
		System.out.println("I am a Dog.");
	}
}
class Snake extends Animal{
	@Override
	public void whoAmI() {
		System.out.println("I am a Snake.");
	}
}
public class RunTimePolymorphism {
	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.whoAmI();
		obj = new Cow();
		obj.whoAmI();
		obj = new Dog();
		obj.whoAmI();
		obj = new Snake();
		obj.whoAmI();
	}
}
