package com.eyeopen.constructor;

public class FacebookProfile {
	public static void main(String[] args) {
		Facebook fb = new Facebook();
		fb.setAge(21);
		fb.setContactNo(9884012345L);
		fb.setMaritalStatus("single");
		
		System.out.println("Age: "+fb.getAge());
		System.out.println("Contact No: "+fb.getContactNo());
		System.out.println("Status: "+fb.getMaritalStatus());
	}
}
