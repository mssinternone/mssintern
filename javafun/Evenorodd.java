package javafun;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" is an even number");
		}
		else {
			System.out.println(n+" is a odd number ");
		}
		
		
	}
}
