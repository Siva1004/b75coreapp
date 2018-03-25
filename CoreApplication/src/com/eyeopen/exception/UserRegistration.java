package com.eyeopen.exception;

import java.util.Scanner;

public class UserRegistration {
	//private static User user;
	private static Scanner scan;
	
	public static User getUserDetails() {
		User user = new User();
		scan = new Scanner(System.in);
		System.out.println("Enter the user name. ");
		user.setUserName(scan.nextLine());
		System.out.println("Enter the age. ");
		user.setAge(Integer.parseInt(scan.nextLine()));
		System.out.println("Enter the country. ");
		user.setCountry(scan.nextLine());
		return user;
	}
	public static void validate(User u)throws AgeValidationException {
		if(u.getAge()<18) {
			throw new AgeValidationException("Age must be >17");
		}else if(!u.getCountry().equalsIgnoreCase("india")) {
			throw new CountryValidationException("Only for Indians.");
		}
	}
	public static void main(String[] args) {
		User info = getUserDetails();
		try {
			validate(info);
			System.out.println("Successfully Registered. ");
			System.out.println("Welcome to Mr./Ms. "+info.getUserName());
		}catch(AgeValidationException | CountryValidationException e) {
			System.err.println("Sorry, Your are not eligible.");
			System.err.println("Reason for "+e.getMessage());
		}finally {
			System.out.println("Thank you.");
		}
	}
}
