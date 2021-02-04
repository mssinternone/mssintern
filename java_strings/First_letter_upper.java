package java_strings;
import java.util.Scanner;

public class First_letter_upper {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String st = "";
		
		String up="";
		for(int i=0;i<str1.length();i++)
		{
			if((i==0) && (str1.charAt(0)!=' '))
			{
				 char ch = Character.toUpperCase(str1.charAt(0));
				 up = String.valueOf(ch);
				 st = st + up + str1.charAt(1);
			}
			
			else if(i+1 < str1.length())
			{
				if(str1.charAt(i) == ' ' && (str1.charAt(i+1)!=' ') )
				{
					char ch = Character.toUpperCase(str1.charAt(i+1));
					up = String.valueOf(ch);
					st = st + up;
				}
				else 
				{
					st = st + str1.charAt(i+1);
				}
			}
		}
		System.out.println(st);
		
		
	}
}
