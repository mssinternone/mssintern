package ControlStatementsandArrays;
import java.util.Scanner;
public class EvenOrOdd {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int num;
	System.out.println("enter a number");
	num=sc.nextInt();
	if(num%2 ==0)
	{
		System.out.println(num+" is a even number");

	}
	else
	{
		System.out.println(num+" odd a number");

	}
		
}
}
