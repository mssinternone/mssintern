package javaintern;
import java.util.Scanner;
public class table 
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter number to print table");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<12; i++)
		{
			  System.out.printf("%d * %d = %d \n", n, i, n * i);
		}
	}
	
}
