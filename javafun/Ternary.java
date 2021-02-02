package javafun;
import java.util.Scanner;
public class Ternary {
   
	public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		boolean c=a>b ? true:false;
		if(c) {
			System.out.println(a+" is big");
		}
		else {
			System.out.println(b+ " is big");
		}
	}
	
}
