package java_Parctice;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count =0;
		
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+"\n");
			}
		}		
		
	}

}
