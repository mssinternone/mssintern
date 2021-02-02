package javaintern;
import java.util.Scanner;
public class doWhileTable
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("enter n umber to print table using do-while");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
			do
			{
				 System.out.printf("%d * %d = %d \n", n, i, n * i);
				i=i+1;
			}while(i<12);
		

	}

}
