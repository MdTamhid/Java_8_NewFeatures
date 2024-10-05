package Star;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class A 
{
	
	ArrayList<Integer>l=new ArrayList<Integer>();

    
	Scanner sc=new Scanner(System.in);
	
	
	void TicektForMovie()
	{
		System.out.println("=======Welcome to ABC Hall !!=======");
		System.out.println("-----------------------------------");
		System.out.println("| "+1+"       Hello Bro            |");
		System.out.println("| "+2+"       Tere Liye            |");
		System.out.println("| "+3+"       Dil                  |");
		System.out.println("| "+4+"       Soldier              |");
		System.out.println("| "+5+"       Aashique             |");
		System.out.println("-----------------------------------");
		System.out.println("Plese chose a number for your moive ticket :: ");
		
		//String arr[]=new String[sc.nextInt()];
		int option=0;
		option =sc.nextInt();
		
		switch(option)
		{
		case 1: 
			System.out.println("Hello Bro");
			break;
		case 2:
			System.out.println("Tere Liye");
			break;
		case 3:
			System.out.println("Dil");
			break;
		case 4:
			System.out.println("Soldier");
			break;
		case 5:
			System.out.println("Aashique");
			break;
			default :
				System.out.println("Invalid enter :: ");
       }
		
		System.out.println("How many ticket you wnat ?");
		
		String arr[]=new String[sc.nextInt()];
		System.out.println("Please enter your +"+arr.length+" name for ticket");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.next();
		}
		
		
	//   Snacks   	
		System.out.println("Do you want add snacks? If yes");
		
		System.out.println("-----------------------------------");
		System.out.println("| "+11+"       Samosa               |");
		System.out.println("| "+22+"       Kurkude              |");
		System.out.println("| "+33+"       Chips                |");
		System.out.println("| "+44+"       Popkon               |");
		System.out.println("| "+45+"       Coldrink             |");
		System.out.println("| "+46+"       Mixer                |");
		System.out.println("-----------------------------------");
		
       System.out.println("Please enter an option !!");
		
		int Yes=0;
		
		Yes =sc.nextInt();
		
		switch(Yes)
		{
		case 11: 
			System.out.println("Samosa");
			break;
		case 22:
			System.out.println("Kurkude");
			break;
		case 33:
			System.out.println("Chips");
			break;
		case 44:
			System.out.println("Popkon");
			break;
		case 45:
			System.out.println("Coldrink");
			break;
		case 46:
			System.out.println("Mixer");
			break;
			default :
				System.out.println("Invalid enter :: ");
				l.add(Yes);
       }
		for(Integer h:l)
		{
			System.out.println(h+"   Snaks ");
		}
		
		
		Yes =sc.nextInt();
		
		System.out.println(Yes+"Congrats you got the ticket "+arr.length+" "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) 
	{
	   A a = new A();	
	   a.TicektForMovie();
	}
}
