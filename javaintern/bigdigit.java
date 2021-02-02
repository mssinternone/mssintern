package javaintern;
import java.util.Scanner;
public class bigdigit {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		 
			Scanner in=new Scanner(System.in); 
			System.out.println("Enter a number : ");
			int no=in.nextInt(); 
			int big=0;
			while(no!=0)
			{ 
			if((no%10)>big)
			{ 
			big=no%10; 
			} 
			no=no/10; 
			System.out.println("Biggest number is"+big); 


	}
	}
}

