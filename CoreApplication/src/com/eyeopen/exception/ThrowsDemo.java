package com.eyeopen.exception;

import java.io.IOException;

class Acer{
	public void test1(int a, int b)throws IOException {
		if(b==0) {
			throw new IOException("Test1: Invalid Input.");
		}
		int res = a/b;
		System.out.println("Test1: result of (a/b) is "+res);
	}
	public void test2(int a, int b) {
		try {
			int res = a/b;
			System.out.println("Test2: result of (a/b) is "+res);
		}catch(ArithmeticException ae) {
			throw ae;
		}
	}
}
public class ThrowsDemo {
	public static void main(String[] args) {
		Acer obj = new Acer();
		try {
			obj.test1(12, 4);
			obj.test2(12, 0);
		}catch(IOException | ArithmeticException e) {
			System.err.println("Error Message:: "+e.getMessage());
		}finally {
			System.out.println("Good Bye.");
		}
	}
}