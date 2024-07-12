package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MinMaxDeno {
	
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
		Integer min = filteredStream.min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		System.out.println("Now in single line :: ");
		
	
	   Integer minValue = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
	   System.out.println(minValue);
	   Integer maxValue = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
	   System.out.println(maxValue);
	   
	}

}
