package javaintern;
import java.util.Scanner;
public class perfectNumber 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	int i, sum = 0;
	for(i=1; i<num; i++)
	{
	if(num%i == 0)
	{
	sum += i;
	}
	}

	if(sum == num)
	{
	System.out.print(num + "is a Perfect Number\n");
	}
	else
	{
	System.out.print(num + "is not a Perfect Number\n");
	}
	}
	}



