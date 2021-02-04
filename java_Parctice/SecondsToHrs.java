package java_Parctice;
import java.util.Scanner;


public class SecondsToHrs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter in seconds");
		float seconds= scan.nextInt();
		float hrs = seconds/3600;
		System.out.println("second in hours");
		System.out.println("Equivalent Hours = "+ (int) hrs);
	}


}
