package ControlStatementsandArrays;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a 2 number to calculate");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("enter your choice");
		
		System.out.println("1.addition , 2.subtraction , 3.Multiplication , 4.Division ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			int add=num1+num2;
			System.out.println("addition of two numbers is "+add);
			break;
		case 2:
			int sub=num1-num2;
			System.out.println("subraction of 2 number"+sub);
			break;
		case 3:
			int mul=num1*num2;
			System.out.println("multiplication of 2 numbers"+mul);
			break;
		case 4:
			int div=num1%num2;
			System.out.println("divison of 2 number"+div);
			break;
		default:
			System.out.println("");
		}
	}

}
