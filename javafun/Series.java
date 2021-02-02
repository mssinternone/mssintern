package javafun;

import java.util.Scanner;
public class Series{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter n to find sum  1 + x/1! + x^2/2! + x^3/3! + .......... + x^n/n!");
		 int n=scan.nextInt();
		 int sum=0;
		 System.out.printf("1 +");
		for(int i=2;i<=n;i++) {
		if(i!=n)
			System.out.printf("x^"+i+"/"+i+"! +");
		else
			System.out.printf("x^"+i+"/"+i+"!");
		}
	}
}

