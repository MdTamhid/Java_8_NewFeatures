package package1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastIteratorClass{
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, Integer> map=new ConcurrentHashMap<>();
		
		map.put("Tmahid", 30);
		map.put("Radha", 40);
		map.put("Shiyam", 20);
		map.put("Lal Babu", 90);
		
		for(Entry<String, Integer> l:map.entrySet())
		{
			System.out.println(l.getKey()+" : "+l.getValue());
			map.put("Something", 43);
		}
	}

}
