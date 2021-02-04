package java_Parctice;
import java.util.Scanner;


public class Palindrome1{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number to find no of digits");
		int n = scan.nextInt();
		int check=n;
		int rev=0,sum=0;
		while(n>0) {
	     	rev=n%10;
	     	sum=sum*10+rev;
	     	n=n/10;
		}
		if(sum==check)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	} 


}
