package ControlStatementsandArrays;
import java.util.Scanner;
public class checkspclchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("enter any character");
		ch=sc.next().charAt(0);
		
		if(ch>=65 && ch<=90)
		{
			System.out.println(ch+"is in upper ccase");
		}
		else if(ch >=97 && ch<=122)
		{
			System.out.println(ch+"is in lower case");
		}
		else if(ch >=48 && ch <=57 )
		{
			System.out.println(ch+"is  a number");
		}
		else 
		{
			System.out.println(ch+" is a special character");
		}
	}

}
