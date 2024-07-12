package Lamda;

import java.util.Arrays;
import java.util.List;

public class TerminalVsNonTerminalOperation {
	
	public static void main(String[] args) {
		
		employee emp1=new employee(1, "Tamhid1");
		employee emp2=new employee(2, "Tamhid2");
		employee emp3=new employee(3, "Tamhid3");
		employee emp4=new employee(4, "Tamhid4");
		
		List<employee> list= Arrays.asList(emp1,emp2,emp3,emp4);
		
		List<Integer> newList=Arrays.asList(1,2,3,4,5);
		
		//newList.stream().filter(a -> a%2== 0).map(a -> a+a).filter(a -> a>5).forEach(x -> System.out.println(x));
		
	    // Reduce
		int sums=0;
		for(int i=0; i<=5; i++)
		{
			sums+=i;
			
		}
		System.out.println(sums);
		System.out.println("--------------");
		System.out.println(newList.stream().reduce((a,b)-> a+b).get());
	
	}

}

class employee{
	
	private int id;
	private String name;
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	 
}
