package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(15);
		list.add(25);
		list.add(52);
		
		Stream s=list.stream().map(i -> i*i);
		s.forEach(x->System.out.println(x));
	}
}
