package javafun;

import java.util.Scanner;
public class Time{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter in hours");
		int hours= scan.nextInt();
		System.out.println("hours in seconds");
		System.out.println(hours*3600);
	}
}
