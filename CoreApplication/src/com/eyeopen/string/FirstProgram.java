package com.eyeopen.string;

public class FirstProgram {
	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String("Eyeopen");
		String s3 = s2 + " Technologies";
		char[] ch = {'o','r','a','c','l','e'};
		String s4 = new String(ch);
		String s5 = new String(ch,0,4);
		byte[] by = {'c','e','r','t','i','f','i','c','a','t','i','o','n'};
		String s6 = new String(by);
		String s7 = new String(by,7,3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);		
	}
}
