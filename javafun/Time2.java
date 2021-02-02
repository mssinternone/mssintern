package javafun;
import java.util.Scanner;
public class Time2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter in seconds");
		float seconds= scan.nextInt();
		System.out.println("second in hours");
		System.out.println(seconds/3600);
	}
}
