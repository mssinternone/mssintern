package javaintern;
import java.util.Scanner;
public class ascii {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("enter Character or number or special character to check whether what is it");
		Scanner sc=new Scanner(System.in);
		
		
		
			
			char ch = sc.next().charAt(0);
			if(ch >= 65 && ch <= 90)
				System.out.print("Upper");
			else if(ch >= 97 && ch <= 122)
				System.out.print("Lower");
			else if(ch >= 48 && ch <= 57)
				System.out.print("Number");
			else
				System.out.print("Symbol");
		}

	}


