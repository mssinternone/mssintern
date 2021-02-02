package javafun;
import java.util.Scanner;
public class Clac {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a and b values");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("choose operation\n 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		c=sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("Addition of two numbers : "+(a+b));
		     break;
		case 2:
			System.out.println("Subtraction of two numbers: "+(a-b));break;
		case 3:
			System.out.println("Multiplication of two numbers: "+(a*b));break;
		case 4:
			System.out.println("Division of two numbers: "+(a/b));break;
		
		}
	
}
}
