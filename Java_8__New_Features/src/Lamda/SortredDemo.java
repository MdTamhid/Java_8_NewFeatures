package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortredDemo {
  
	public static void main(String[] args) {
		
		

		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(25);
		list.add(52);
		
		// get stream object
		Stream<Integer> openSteram=list.stream();
		// configure stream by filtering our required values
		Stream<Integer> filteredStream=openSteram.filter(i -> i>=20);
		// We can sort on any stream filter or mapped or on normal stream (non fiter or no mapped to)
		Stream<Integer> sorted = filteredStream.sorted();
		sorted.forEach(x->System.out.println(x));
		
		
		System.out.println("Now in single line::");
		
		Stream<Integer> newFilterShortedList= list.stream().filter(i -> i>=20).sorted();
		newFilterShortedList.forEach(x -> System.out.println(x));

	
	}
}
