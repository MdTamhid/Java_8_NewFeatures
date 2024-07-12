package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateSteam {
	
	public static void main(String[] args) {
		
		List<Integer> arList=new ArrayList<Integer>();
		arList.add(10);
		arList.add(20);
		arList.add(25);
		
		Stream s=arList.stream().filter(i-> i%2 == 0);
		s.forEach(x -> System.out.println(x));
		
		
	}

}
