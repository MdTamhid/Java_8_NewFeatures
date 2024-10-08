package tam;

import java.util.*;

public class ClassOtp {

	// Java code to explain how to generate OTP

	// Here we are using random() method of util
	// class in Java

	static char[] OTP(int len) {
		System.out.println("Generating OTP !!");
		System.out.print("You OTP is : ");

		// Using numeric values
		String numbers = "0123456789";

		// Using random method
		Random rndm_method = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		}
		return otp;
	}

	public static void main(String[] args) {
		int length = 4;		
		char[] otps = OTP(length);
		System.out.println(otps);
	}
}
