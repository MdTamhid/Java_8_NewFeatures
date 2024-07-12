package Lamda;

public class MethodRefrenceDemo {
	
	public static void main(String[] args) {
		
		//FunctionInterfaceDemo fun= test:: testImplementation;
		//fun.singleAbstMehotd();
		
		FunctionInterfaceDemo f=()->System.out.println("Implementation!!");
		f.singleAbstMehotd();
	}

}

/*
 * class test{
 * 
 * public static void testImplementation() {
 * System.out.println("This is the implementation of our abstarct method!!"); }
 * }
 */