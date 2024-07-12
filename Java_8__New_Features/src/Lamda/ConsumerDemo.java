package Lamda;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		ConsumerDemo demo=new ConsumerDemo();
		demo.testConsumer(5);
		
		Consumer<Integer> con=i-> System.out.println("Taking a number and performing square ::"+i*i);;
		con.accept(5);
		
	}
	
	public void testConsumer(int i)
	{
		int a=i*i;
		System.out.println("Square number is "+a);
	}

}
