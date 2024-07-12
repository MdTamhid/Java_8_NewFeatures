package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		
		List<Integer> newlist=new ArrayList<Integer>();
		newlist = list.stream().filter(x -> x>=15).collect(Collectors.toList());
		//newlist.stream().forEach(x-> System.out.println(x));
		
	}

}
