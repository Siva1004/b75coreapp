package com.eyeopen.string;

public class StringAPIDemo {
	public static void main(String[] args) {
		String s1 = "Eyeopen Technologies.";
		System.out.println("4th position is "+s1.charAt(3));
		String s2 = "apple";
		String s3 = "Apple";
		String s4 = "Apple";
		String s5 = "               oracle       certification      ";
		System.out.println(s2.compareTo(s3));
		System.out.println(s3.compareTo(s2));
		System.out.println(s3.compareTo(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s4.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("Before the Trim -> "+s5.length());
		s5 = s5.trim();
		System.out.println("After the Trim -> "+s5.length());
		System.out.println(s5);
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(8, 12));
		String s6 = "Apple,Banana,Orange,Grapes,Goa";
		String[] fruits = s6.split(",");
		for(String name:fruits) {
			System.out.println(name);
		}
		byte[] by = s1.getBytes();
		System.out.println(by);
		System.out.println(s1.replace('e', 'E'));	
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.lastIndexOf('e'));
	}
}
