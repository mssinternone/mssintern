package ControlStatementsandArrays;

import java.util.Scanner;

public class dividedBy3And5 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int x;
		System.out.println("enter a number");
		x=obj.nextInt();
		if(x%3==0 && x%5==0) {
			System.out.println(x + " Divded by both 3 and 5");
		}
		else {
			System.out.println(x + " not divided by 3 and 5");
		}

	}

}
