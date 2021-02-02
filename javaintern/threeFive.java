package javaintern;
import java.util.Scanner;
public class threeFive {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check divisibility by 3 and 5");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		if((n%3==0)&&(n%5==0))
		{
			System.out.println("number divisble  by 5 and 3");
		}
		else
		{
			System.out.println("number not divisble  by 5 and 3");
		}
	}

}
