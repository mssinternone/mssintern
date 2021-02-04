package java_Parctice;
import java.util.Scanner;

public class Division {
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if((n%3==0) && (n%5==0))
		{
			System.out.println("Divisible by both 3 and 5");
		}
		else
		{
			System.out.println("Not divisible both by 3 and 5");
		}
		
	}

}
