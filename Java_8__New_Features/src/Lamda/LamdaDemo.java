package Lamda;

import java.util.function.BiConsumer;

public class LamdaDemo {
	
	public static void main(String[] args) {
		/*
		  // Addition BiConsumer<Integer, Integer>
		  biConsumer=(a,b)->System.out.println(a+b); biConsumer.accept(10, 20);
		 */
		// Subtraction
		BiConsumer<Integer, Integer> biConsumer=(a,b)->System.out.println(a-b);
	    biConsumer.accept(30, 10);
	}

}
