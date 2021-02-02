package javafun;

import java.util.Scanner;
public class Digits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number to find no of digits");
		int n = scan.nextInt();
		int noOfDigi=0;
		while(n>0) {
	        n = n/10;
	        noOfDigi+=1;
		}
		System.out.println(noOfDigi);
	}
}
