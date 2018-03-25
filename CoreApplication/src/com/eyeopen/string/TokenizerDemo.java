package com.eyeopen.string;

import java.util.StringTokenizer;

public class TokenizerDemo {
	public static void main(String[] args) {
		String s1 = "Apple Banana Orange Grapes Goa";
		StringTokenizer sToken = new StringTokenizer(s1);
		while(sToken.hasMoreTokens()) {
			System.out.println(sToken.nextToken());
		}
	}
}
