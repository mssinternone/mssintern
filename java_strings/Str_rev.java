package java_strings;
import java.util.Scanner;

public class Str_rev {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
//		System.out.print(str1.length());
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
		sc.close();
		
	}
}
