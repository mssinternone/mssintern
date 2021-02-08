package ControlStatementsandArrays;

import java.util.Scanner;

public class claculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a 2 number to calculate : ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("enter your choice : ");

		System.out.println("\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n ");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		int add=num1+num2;
		System.out.println("Addition of "+ num1 +" & "+ num2 +" : "+add);
		break;
		case 2:
		int sub=num1-num2;
		System.out.println("Subraction of "+ num1 +" & "+ num2 +" : "+sub);
		break;
		case 3:
		int mul=num1*num2;
		System.out.println("Mltiplication of "+ num1 +" & "+ num2 +" : " +mul);
		break;
		case 4:
		int div=num1%num2;
		System.out.println("Divison of "+ num1 +" & "+ num2 +" : "+div);
		break;
		default:
		System.out.println("Plz enter correct choice!!");
		}
		}		
		
}


