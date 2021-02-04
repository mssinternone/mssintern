package java_Parctice;

import java.util.Scanner;

public class Range {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter n to validate");
		int n=scan.nextInt();
		if(n>=1&&n<=10)
			System.out.println(n+" is in range");
		else
			System.out.println(n+" not in range");
	}
}
