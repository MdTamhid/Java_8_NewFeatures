package tam;

import java.util.Scanner;

public class MyClaci {

	public static void main(String[] args) {
		int n1;
		int n2;
		int op = 0;
		// Scanner sc=new Scanner(System.in);
		System.out.println("Your calculater");
		System.out.println("|-----------------------|");
		System.out.println("|-----1 Addition---------|");
		System.out.println("|-----2 Substractionn----|");
		System.out.println("|-----3 Multiplication---|");
		System.out.println("|-----4 Division---------|");
		System.out.println("|-----------------------|");
		System.out.println("Chossen an option !!");
		Scanner sc = new Scanner(System.in);
		op = sc.nextInt();
		System.out.println("Enter First digit !!");
		n1 = sc.nextInt();
		System.out.println("Enter Second digit !!");
		n2 = sc.nextInt();

		switch (op) {
		case 1:
			System.out.println("After addition value is " + (n1 + n2));
			break;

		case 2:
			System.out.println("After substrication value is" + (n1 - n2));
			break;

		case 3:
			System.out.println("After multiplication value is " + (n1 * n2));
			break;

		case 4:
			System.out.println("After division value is " + (n1 / n2));
			break;

		default:
			System.out.println("You have chossen an invalid option !! \n Please chose correct option");

		}
	}

}
