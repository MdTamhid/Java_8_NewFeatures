package tam;

import java.util.Scanner;

public class MainAccount 
{ 
	private static int bal=100;
   
	@SuppressWarnings("resource")
	static void balnce()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter amount how much you want to withdrow?");
		int num=sc.nextInt();
		try 
		{
		   if(bal<=num)
		   {
			   throw new MinimunAccountBalalnce("You have insufficient balance Please add amount on your account!!");
			   
		   }
		   else
		   {
			   System.out.println("Your transaction sucessfull please collect amount "+num );
		   }
		  
		}
		 catch(MinimunAccountBalalnce e)
		   {
			  e.printStackTrace();
		   }
		finally
		{
			System.out.println("Thank you for connect with us. You have good time please visit again");
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		balnce();
	}
}
