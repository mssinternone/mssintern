package javaintern;
import java.util.Scanner;
public class evenOdd
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check wheter even or odd");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("entered  number is even");
		}
		else
		{
			System.out.println("entered number is odd");
		}
		
		
		
		
	}
       
}
