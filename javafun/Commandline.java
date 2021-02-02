package javafun;

import java.util.Scanner;

public class Commandline {

	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		System.out.println("hey!! "+s+" you have successfully printed at run time...");
	}
}
