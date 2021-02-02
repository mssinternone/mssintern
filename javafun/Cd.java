package javafun;
import java.util.Scanner;
public class Cd{

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a digit");
		int d=sc.nextInt();
		System.out.println("enter a character");
		char c=sc.next().charAt(0);
		System.out.println("you have entered "+d+" and "+c);
		
	}
	 
}
