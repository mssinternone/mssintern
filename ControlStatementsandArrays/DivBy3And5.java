package ControlStatementsandArrays;
import java.util.Scanner;
public class DivBy3And5 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int num=sc.nextInt();
if(num % 3==0 && num%5==0)
{
	System.out.println(num +"is divisible");
}
else
{
	System.out.println(num +"is not divisible");
}
}
}

