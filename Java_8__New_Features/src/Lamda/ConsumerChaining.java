package Lamda;

import java.util.function.Consumer;

public class ConsumerChaining {
  
	public static void main(String[] args)
	{
		Consumer<Integer> squareMe=i->System.out.println("Taking an input and performing square ::"+i*i);
		squareMe.accept(5);
		
		Consumer<Integer> doubleMe=i->System.out.println("Taking an input and perfoming doubling:: "+2*i);
		doubleMe.accept(5);
		
		squareMe.andThen(doubleMe).accept(5);
		
		
		
	}
}
