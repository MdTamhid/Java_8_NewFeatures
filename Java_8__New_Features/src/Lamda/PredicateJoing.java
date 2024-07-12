package Lamda;

import java.util.function.Predicate;

public class PredicateJoing {
	
	public static void main(String[] args) {
		
		Predicate<String> checkLength=s->s.length()>5;
		System.out.println("The length of Stirng greater then 5::"+checkLength.test("Tmahid Alam"));
		
		Predicate<String> checkEvenLength= s->s.length()%2==0;
		System.out.println("The length of String is::"+checkEvenLength.test("Tamhid Alam"));
		
		// It can be joined with And
		System.out.println("After margin with and "+ checkLength.and(checkEvenLength).test("Tamhid Alam"));
		
		// It can be joined Or
		System.out.println("After margin with Or "+checkLength.or(checkEvenLength).test("Tamhid Alam"));
		
		// It can be joined Negate
		System.out.println("After margin with negate "+checkLength.negate().test("Tamhid Alam"));
	}

}
