package ControlStatementsandArrays;
import java.util.Scanner;
public class positivenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter a number");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num + " positive -3number");
	
		}
		else
		{
			System.out.println(num + " negative  number");

		}
	}

}
