package ControlStatementsandArrays;

import java.util.Scanner;

public class BigIn2Num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter a value");
		System.out.println("enter b value");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b) {
			System.out.println(a + " is a biggest number");
			
		}
		else {
			System.out.println(b +" is a biggest number");
		}
	}

}
