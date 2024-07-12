package Lamda;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args)
	{
//		SupplierDemo demo= new SupplierDemo();
//		System.out.println(demo.fetchCurentDate());
		
		Supplier<Date> 	currentDate= ()-> new Date();
		System.out.println(currentDate.get());
	}
	
//	public Date fetchCurentDate()
//	{
//		return new Date();
//	}
}
