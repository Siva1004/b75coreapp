package com.eyeopen.constructor;

public class OverloadDemo {
	public void test() {
		System.out.println("Default::TEST()");
	}
	public void test(String name) {
		System.out.println("Welcome to Mr./Ms."+name);
	}
	public void test(int a,int b) {
		System.out.println("a value is "+a+" b value is "+b);
	}
	public int test(int p, int q, int r) {
		return p*q*r;
	}
	public static void main(String[] args) {
		OverloadDemo obj = new OverloadDemo();
		obj.test();
		obj.test("Hari");
		obj.test(10,20);
		int res = obj.test(6,7,8);
		System.out.println("Received value: "+res);
	}
}
