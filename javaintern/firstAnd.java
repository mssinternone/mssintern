package javaintern;
import java.util.Scanner;
public class firstAnd
{
	public static void main(String...args)
	{ 
		int first=0;
		Scanner in=new Scanner(System.in); 
		System.out.println("Enter a Number : ");
		int no=in.nextInt(); 
		int temp=0;
		int last=no%10; 
		while(no!=0)
		{ 
			temp=temp*10+(no%10); 
			no=no/10; 
			first=temp%10; 
			
		}
		System.out.println("Sum of First and last digits : "+(first+last));
	}
}
