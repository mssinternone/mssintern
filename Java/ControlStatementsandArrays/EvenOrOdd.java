package ControlStatementsandArrays;

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String args[]) {
		
		Scanner obj=new Scanner(System.in);
		
		int x;
		
		System.out.println("enter a number");
		
		x=obj.nextInt();
		
		if(x%2==0) {
			System.out.println(x +" even number");
		}
		else {
			System.out.println(x +" odd number");
		}
		
		
	}

}
