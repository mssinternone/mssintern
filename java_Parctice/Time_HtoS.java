package java_Parctice;
import java.util.Scanner;

public class Time_HtoS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter in hours");
		int hours= scan.nextInt();
		
		int seconds = hours*3600;
		System.out.println("hours in seconds");
		System.out.println(seconds+" seconds ");
		scan.close();
	}
	

}
