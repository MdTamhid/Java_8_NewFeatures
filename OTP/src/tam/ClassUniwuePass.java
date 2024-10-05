package tam;

public class ClassUniwuePass {

	// Java code to explain how to generate OTP

	// declaring a of return type String
	// which on calling provides the otp
	public static String generateOTP() {     // int randomPin declared to store the otp
											// since we using Math.random() hence we have to type cast it int
											// because Math.random() returns decimal value
		int randomPin = (int) (Math.random() * 90000) + 10000;
		String otp = String.valueOf(randomPin);
		return otp; // returning value of otp
	}

	public static void main(String args[])// method to call and print otp
	{
		String otpSting = generateOTP();// function calling
		System.out.println("OTP : " + otpSting);
	}
}// Here we are using Math.random() function.
	// class in Java
	