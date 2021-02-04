package java_Parctice;
import java.util.Scanner;


public class Evenclass {
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
		
	}
}
