package ControlStatementsandArrays;
import java.util.Scanner;
public class BigIn2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a 2 numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+"num1 is bigger than num2");
		}
		else
		{
			System.out.println( num2+" is bigger than num1 ");
		}
		
	}

}
