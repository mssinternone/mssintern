package ControlStatementsandArrays;
import java.util.Scanner;
public class TableUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to its table");
		int num=sc.nextInt();
		
		int i=1; 
		do
		{
			System.out.println(num +"*" +i+ "="+ (num*i));
			i++;
		}while(i<=20);
	}

}
