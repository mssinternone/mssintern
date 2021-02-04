package java_Parctice;
import java.util.Scanner;

public class Multiplication_table {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		
		System.out.println("Multiplication Table of"+x+"is:\n");

		for(int i=1;i<=10;i++) {
			
			System.out.println(x+" * "+i+"  =   "+x*i);
			
		}
		
		
	}

}
