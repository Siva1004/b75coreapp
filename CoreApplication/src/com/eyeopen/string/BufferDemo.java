package com.eyeopen.string;

public class BufferDemo {
	public static void main(String[] args) {
		String str = "stanford";
		System.out.println("str hasCode value -> "+str.hashCode());
		str = str + "university";
		System.out.println("str hasCode value -> "+str.hashCode());
		
		StringBuilder sb = new StringBuilder("stanford");
		System.out.println(sb);
		System.out.println("sb hashCode value -> "+sb.hashCode());
		sb.append(" university");
		System.out.println(sb);
		System.out.println("sb hashCode value -> "+sb.hashCode());
		//System.out.println(sb.reverse());
		sb.setCharAt(0, 'S');
		System.out.println(sb);
		System.out.println(sb.insert(0, "USA, "));
		System.out.println(sb.delete(0, 5));
		System.out.println(sb.replace(0, 8, "Anna"));
		
		
	}
}
