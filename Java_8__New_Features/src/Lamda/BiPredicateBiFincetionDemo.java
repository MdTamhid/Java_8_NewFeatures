package Lamda;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFincetionDemo {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> checkSumOftwo=(a,b)-> a+b >=5;
		System.out.println("Sum of 2 and 5 is gerather then 5 :"+checkSumOftwo.test(2, 5));
		System.out.println("Sum of 2 and 1 is greather then 5 :"+checkSumOftwo.test(2, 1));
		
		BiFunction<Integer, Integer, Integer> multiplyBoth= (a,b) -> a*b;
		System.out.println("Multiple of 5 and 10 is "+multiplyBoth.apply(5, 10));
		
	}

}
