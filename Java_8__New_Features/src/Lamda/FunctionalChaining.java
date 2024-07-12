package Lamda;

import java.util.function.Function;

public class FunctionalChaining {
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> doubleIT=i-> 2*i;
		System.out.println("Double function :: "+doubleIT.apply(2));
		
		Function<Integer, Integer> cubeIt= i-> i*i*i;
		System.out.println("Cube Function :: "+cubeIt.apply(2));
		
		System.out.println("First doubling using applay:: "+doubleIT.andThen(cubeIt).apply(2));
		
		System.out.println("First cubing using compose :: "+doubleIT.compose(cubeIt).apply(2));
	}

}
