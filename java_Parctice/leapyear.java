package java_Parctice;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if((n % 400 == 0) || ((n%4==0) && (n%100!=0) ))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}
