package java_Parctice;
import java.util.Scanner;

public class Coordinate {
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x==0 && y!=0)
		{
			System.out.println("Point lies on y axis");
		}
		else if(y==0 && x!=0)
		{
			System.out.println("Point lies on x axis");
		}
		else if(x==0 && y==0)
		{
			System.out.println("Point lies on the origin");
		}
		else
		{
			System.out.println("Point lies neither on X axis nor y axis");
		}
	}

}
