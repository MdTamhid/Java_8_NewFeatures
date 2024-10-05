package package1;
import java.util.Scanner;

public class ClassSeitch {
	
	
	public static void main(String[] args) {
	
		int operator, n1, n2;
	    System.out.println(" 1 - Add \n 2 - Substract \n 3 - Multiplication \n 4 - Division \n");
	    System.out.println("Chose operator :");
	    Scanner sc= new Scanner(System.in);
	    operator=sc.nextInt();
	    System.out.println("Enter first number : ");
	    n1=sc.nextInt();
	    System.out.println("Enetr Second number : ");
	    n2=sc.nextInt();
	    
	    switch(operator) {
	     
	    case 1:
	    	System.out.println(n1+n2);
	    	break;
	    case 2: System.out.println(n1-n2);
	        break;
	    case 3: System.out.println(n1*n2);
	        break;
	    case 4: System.out.println(n1/n2);
	        break;
	        default : System.out.println("Envalid option");
	    	
	    }
		
	}

}
