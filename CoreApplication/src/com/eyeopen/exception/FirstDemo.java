package com.eyeopen.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FirstDemo {
	public static void main(String[] cust) {
		
//		Date date = new Date();
//		System.out.println("System Response: "+date);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//		System.out.println("Client Response: "+sdf.format(date));
//		
//		String myDate = "2/24/18";
//		SimpleDateFormat sdf1 = new SimpleDateFormat("M/dd/yy");
//		try {
//			Date usDate = sdf1.parse(myDate);
//			sdf = new SimpleDateFormat("M/d/yy EEE");
//			System.out.println("Client Response: "+sdf.format(usDate));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the a value ");
		int a = scan.nextInt();
		//System.out.println("Enter the b value ");
		try {
			int b = Integer.parseInt(cust[0]);
			int res = a/b;
			System.out.println("Result of (a/b) is "+res);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException aoe) {
			System.err.println("Error Message: "+aoe.getMessage());
			//ae.printStackTrace();
		}
//		catch(ArrayIndexOutOfBoundsException aoe) {
//			System.err.println(aoe);
//		}
		scan.close();		
		System.out.println("end the program.");		
	}
}
