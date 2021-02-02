package projects;

import java.util.Scanner;

public class Nevennumbers {

	public static void main(String[] args) {
		int n,i;
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1;i<=n;i++) 
		{
		if(i%2==0)
		{
			System.out.println("the even numbers are "+i);
		}
		
	}

	}
}

