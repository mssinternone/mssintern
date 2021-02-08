package ControlStatementsandArrays;

import java.util.Scanner;

public class checkSpclChar {

	public static void main(String[] args) {
		
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a charater");
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
			System.out.println(ch +" Upper");
		else if(ch >= 97 && ch <= 122)
			System.out.println(ch +" Lower");
		else if(ch >= 48 && ch <= 57)
			System.out.println(ch +" Number");
		else
			System.out.println(" Special charater");
	}


}
