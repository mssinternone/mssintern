package java_Parctice;
import java.util.Scanner;


public class PrimeOrNot {
	
	public static void main(String[] args) {
		 int i, count;  
		 count = 0;
		 Scanner scan = new Scanner(System.in);
		System.out.println("enter n to check ");
		int n= scan.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if(count == 2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
		  
		scan.close();


}
}
