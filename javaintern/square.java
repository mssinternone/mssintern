package javaintern;
import java.util.Scanner;
public class square 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter number to print squares");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			System.out.println(i*i);
		}

	}

}
