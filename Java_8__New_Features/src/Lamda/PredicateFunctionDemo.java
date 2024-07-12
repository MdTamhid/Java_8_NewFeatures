package Lamda;

import java.util.function.Predicate;

public class PredicateFunctionDemo {
	
	public static void main(String[] args) {
		
		//PredicateFunctionDemo pre=new PredicateFunctionDemo();
		//System.out.println(pre.testStringLength("Hello Tamhid"));
		
		Predicate<String> checkLength=s->s.length()>=5;
		System.out.println("The length of String greater then 5::"+checkLength.test("Hell"));
	}
	
	
//	 public boolean testStringLength(String s)
//	 { 
//		 if(s.length()>=5) 
//		 { 
//			 return true;
//		 }
//		 else 
//		 { 
//			 return false; 
//		 }
//	 }
	 

}
