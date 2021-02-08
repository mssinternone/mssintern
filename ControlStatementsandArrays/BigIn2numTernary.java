package ControlStatementsandArrays;
import java.util.Scanner;
public class BigIn2numTernary {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  2 number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int m=(num1>num2)? num1 : num2;
		{
			System.out.println(m);
		}
	}

}
