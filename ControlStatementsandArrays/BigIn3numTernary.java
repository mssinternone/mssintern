package ControlStatementsandArrays;
import java.util.Scanner;
public class BigIn3numTernary {
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 3 numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	int res=(num1>num2 && num1 >num3)?num1:(num2>num1 && num2>num3)?num2:num3;
	System.out.println(res);
}

}
