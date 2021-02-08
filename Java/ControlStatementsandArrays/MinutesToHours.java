package ControlStatementsandArrays;

import java.util.Scanner;

public class MinutesToHours {

	public static void main(String... args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Time in Minutes : ");
		int t = in.nextInt();
		int hours = t / 60;
		int minutes = t % 60;
		System.out.printf("%d:%02d", hours, minutes);
	}
}