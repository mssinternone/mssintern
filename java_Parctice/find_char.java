package java_Parctice;
import java.util.Scanner;

public class find_char {
	
	public static void main(String[] args)
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		if(ch >=65 && ch<=90)
		{
			System.out.println("Upper Case");
		}
		else if(ch>=97 && ch<=122)
		{
			System.out.println("Lower Case");
		}
		else if(ch>=48 && ch<=57)
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Symbol");
		}
		
		
	}
	

}
