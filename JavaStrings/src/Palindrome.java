import java.io.*;
import java.util.Scanner;

public class Palindrome {
	public static void main(String... args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String name = sc.nextLine();
		int len = name.length();
		System.out.println(len);
		String reverse = "";

		for (int j = len - 1; j >= 0; j--)

			reverse = reverse + name.charAt(j);
		if (name.equals(reverse))

		{
			System.out.println("Palindrome" + reverse);
		} else {
			System.out.println("Not a Palindrome");
		}

	}
}