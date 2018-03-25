package com.eyeopen.operators;

public class BitwiseDemo {
	public static void main(String[] args) {
		int a = 60;		//60 -> 0011 1100
		int b = 13;		//13 -> 0000 1101
		int result;
		
		result=a&b;		//   -> 0000 1100
		System.out.println("a & b = "+result);		//12
		
		result=a|b;		//	 ->	0011 1101			//61
		System.out.println("a | b = "+result);
		
		result=a^b;		//   -> 0011 0001			//49
		System.out.println("a ^ b = "+result);
		
		result=~a;		//	 -> 1100 0011			//-61
		System.out.println("~a = "+result);
		
		result = a<<2;	//	 -> 1111 0000
		System.out.println("a << 2 = "+result);		//240
		
		result = a>>2;	//	 -> 1111
		System.out.println("a >> 2 = "+result);		//15
		
		result = a>>>2;	//   -> 0000 1111		
		System.out.println("a >>> 2 = "+result);	//15
	}
}
