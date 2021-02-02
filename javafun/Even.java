package javafun;
import java.util.Scanner;
public class Even {
      
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int i=1;
		int count=0;
		System.out.println("even numbers ");
		while(count<n)
		{
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}
}
