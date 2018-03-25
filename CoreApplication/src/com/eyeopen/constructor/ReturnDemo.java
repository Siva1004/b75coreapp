package com.eyeopen.constructor;

public class ReturnDemo {
	public String getWords(int n) {
		String result;
		if(n==0) {
			result = "Zero";
		}else if(n==1) {
			result = "One";
		}else if(n==2){
			result = "Two";
		}else if(n==3) {
			result = "Three";
		}else {
			result = "No data found";
		}
		return result;
	}
	public static void main(String[] args) {
		ReturnDemo obj = new ReturnDemo();
		String word = obj.getWords(2);
		System.out.println(word);
	}
}
