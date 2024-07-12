package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SortedDescendingOrderDemo {
  
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
		Stream<Integer> sorted = filteredStream.sorted((i1, i2) -> i2.compareTo(i2));
		sorted.forEach(x -> System.out.println(x));
		
		
		System.out.println("Now in single line::");
		
		Stream<Integer> stream = list.stream().filter(i -> i >=20).sorted((i1, i2) -> i2.compareTo(i1));
		stream.forEach(x -> System.out.println(x));
	}
}
