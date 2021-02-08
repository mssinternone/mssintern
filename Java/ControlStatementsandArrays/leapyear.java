package ControlStatementsandArrays;

import java.util.Scanner;

public class leapyear {
	public static void main(String args[]) {
		
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("enter a number");
		num=obj.nextInt();
		if((num%4==0 && num%100!=0)||(num%400==0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
