package javaintern;
import java.util.Scanner;
public class xyaxis
{
	public static void main(String [] args)
	{
		System.out.println("Enter X and Y axis");
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if((x==0)&&(y==0))
		{
			System.out.println("X and Y axis are at origin");
		}
		else
		{
			System.out.println("X and Y axis are at not origin");
		}
		
	}
}
