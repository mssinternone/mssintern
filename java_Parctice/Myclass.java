package java_Parctice;

import java.util.Scanner;

public class Myclass {

	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n>0) {
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");
		}
		sc.close();
	}
	
	
}
