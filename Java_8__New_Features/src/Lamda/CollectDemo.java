package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(15);
		list.add(25);
		list.add(52);
		list.add(17);
		list.add(1000);
		list.add(100);
		
		// get stream object
		Stream<Integer> openSteram=list.stream();
		// configure stream by filtering our required values
		Stream<Integer> filteredStream=openSteram.filter(i -> i>=20);
		List<Integer> newFilteredListOrigin=filteredStream.collect(Collectors.toList());
		newFilteredListOrigin.stream().forEach(x -> System.out.println(x));

	}
}
