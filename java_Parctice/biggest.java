package java_Parctice;
import java.util.Scanner;

public class biggest {
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		if(x>y)
		{
			System.out.println(x + " is bigger than " + y);
		}
		else
		{
			System.out.println(y+" is bigger than "+x);
		}
		
	}

}
